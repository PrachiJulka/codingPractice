package geeksForGeeks.Arrays.leetCode;

public class CountNumberOfNiceSubArrays {
    public int numberOfSubarrays(int[] nums, int k) {
        // want to ccount subarrays (num of subarrays) that are nice
        int right=0,count=0;
        for(int i=0;i<nums.length;i++){
            while(right<nums.length && k!=0 ){
                if(nums[right]%2!=0)
                    k--;
                right++;
            }
            if(k==0){
                count++;


            }
            if(nums[i]%2==1)
                k++;

        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(new CountNumberOfNiceSubArrays().numberOfSubarrays(new int[]{2,2,2,1,2,2,1,2,2,2},2));
    }
}
