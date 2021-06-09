package geeksForGeeks.Arrays;

public class MoveZero {
    public static void moveZeroes(int[] nums) {
        int zeroIndex=0;
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0 && !flag){
                zeroIndex=i;
                flag=true;
            }
            if(flag && nums[i]!=0){
                nums[zeroIndex]=nums[i];
                nums[i]=0;
                i=zeroIndex;
                flag=false;
            }

        }


    }

    public static void main(String[] args) {
        int[] nums=new int[]{0,1,0,3,12};
        MoveZero.moveZeroes(nums);
        System.out.println(nums);
    }
}
