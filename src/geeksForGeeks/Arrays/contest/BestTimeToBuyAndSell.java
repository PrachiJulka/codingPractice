package geeksForGeeks.Arrays.contest;

public class BestTimeToBuyAndSell {
    public static int maxProfit(int[] prices) {

        boolean increasing=false,decreasing=false;
        int num=prices[0];
        int purchaseStock=0,sellStock=0,maxProfit=0,singleProfit=0;

        for(int i=1;i<prices.length;i++){
            if(++num==prices[i])
                increasing=true;
            else
            {
                increasing=false;
                break;
            }
        }
        if(!increasing){

            for(int i=1;i<prices.length;i++){
                if(--num==prices[i])
                    decreasing=true;
                else
                {
                    decreasing=false;
                    break;
                }
            }
        }
        if(decreasing){
            return 0;
        }
        else if(increasing){
            return prices[prices.length-1]-prices[0];
        }
        else{
            purchaseStock=prices[0];
            for(int i=1;i<prices.length;i++){
                int p=prices[i]-purchaseStock;
                if(prices[i]<purchaseStock && singleProfit==0 || (singleProfit>p)){
                    purchaseStock=prices[i];
                    maxProfit+=singleProfit;
                    singleProfit=0;
                }
                else if(prices.length-1==i && prices[i]>purchaseStock){
                    if(singleProfit<=p)
                        maxProfit+=p;
                    else
                        maxProfit+=singleProfit;
                }
                else if(prices[i]>purchaseStock){
                    if(singleProfit<p)
                    singleProfit=prices[i]-purchaseStock;

                }

            }
            return maxProfit;
        }




    }

    public static void main(String[] args) {
        int[] p=new int[]{1,9,6,9,1,7,1,1,5,9,9,9};
        System.out.println(maxProfit(p));
    }
}
