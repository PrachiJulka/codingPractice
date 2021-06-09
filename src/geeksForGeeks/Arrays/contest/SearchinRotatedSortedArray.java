package geeksForGeeks.Arrays.contest;

public class SearchinRotatedSortedArray {

    public static int search(int[] nums, int target) {

        if(nums.length==0)
            return -1;
        int left=0,right=nums.length-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target)
                return mid;
            else if(nums[mid]<=nums[right]){

               if(target>nums[mid] && target<=nums[right]){
                   left=mid+1;
               }
               else{
                   right=mid-1;
               }
            }
            else{
                if(target<nums[mid]&&target>=nums[left]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num=new int[]{4,5,6,7,0,1,2};
        int l=search(num,4);
        System.out.println(l);
    }

}
