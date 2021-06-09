package geeksForGeeks.Arrays.juneLeetcodeChallenge;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {

        int left=0,right=nums.length-1,index=0;
        if(nums[nums.length-1]<target)
            index=nums.length;
        while(left<=right){
            int mid=left+(right-left)/2;
           // System.out.println(mid);

            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<target){
                left=mid+1;
                if(nums[right]>target)
                 index=right;
            }
            else{
                right=mid-1;
                if(!(right<0) && nums[right]>target)
                    index=right;
                else
                    index=right+1;
                //index=right;
            }
         //   index=right;
        }


        return index;
    }

    public static void main(String[] args) {
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{1,3,5,6},0));
    }
}
