package geeksForGeeks.Arrays.contest;

public class SpecialDiscount {
    public int[] finalPrices(int[] prices) {
        int[] result=new int[prices.length];
        boolean flag=false;
        for(int i=0;i<prices.length;i++){
            if(i+1<prices.length){
                for(int j=i+1;j<prices.length;j++){
                    if (prices[i]>prices[j]) {
                        result[i] = prices[i] - prices[j];
                        flag=true;
                        break;
                    }
                }
            }
            if(!flag)
                result[i]=prices[i];
        }
        return result;
    }
}
