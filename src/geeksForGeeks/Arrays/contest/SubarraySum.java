package geeksForGeeks.Arrays.contest;

public class SubarraySum {
    public static int subarraySum(int[] nums, int k) {
        int sum=k,count=0,dum=0;
        for(int i=0;i<nums.length;i++){
            dum=nums[i];
            if(dum==k)
                count++;
            for(int j=i+1;j<nums.length;j++){

                dum+=nums[j];
                if(dum==k){
                    count++;
                }


            }
        }
        return count;


    }

    public static void main(String[] args) {
        int[] nums=new int[]{1,1,0,1,1};
        System.out.println(subarraySum(nums,2));
    }
}
