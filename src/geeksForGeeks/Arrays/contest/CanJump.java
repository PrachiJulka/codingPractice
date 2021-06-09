package geeksForGeeks.Arrays.contest;

public class CanJump {
    public static boolean canJump(int[] nums) {
        int countStep=nums[0];
        int i=1;
        for(;i<nums.length;i++){

            if(countStep==0){
                break;
            }
            else
                countStep--;
            if(nums[i]>countStep    )
                countStep=nums[i];

        }
        if(i==nums.length)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        canJump(new int[]{3,0,8,2,0,0,1});
    }
}
