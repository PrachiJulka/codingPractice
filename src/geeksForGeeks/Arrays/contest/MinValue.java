package geeksForGeeks.Arrays.contest;

public class MinValue {
    public static int minStartValue(int[] nums) {
        int sum=0,value=0,max=0;
        boolean flag=true;
        if(nums.length==0)
            return sum;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<1){
                max+=(-nums[i]);
            }
        }

        for(int i=1;i<=max;i++){
            flag=true;
            sum=nums[0]+i;
            for(int j=1;j<nums.length;j++){
                if(sum<1){
                    flag=false;
                    break;
                }
                sum+=nums[j];


            }
            if(flag && sum>=1){
                value=i;
                break;
            }
        }
        return value;


    }

    public static void main(String[] args) {
        int [] num=new int[]{-22,-29,-21,0,-4,-26,10,-11,-14,-11};
       int v= minStartValue(num);
        System.out.println(v);
    }
}
