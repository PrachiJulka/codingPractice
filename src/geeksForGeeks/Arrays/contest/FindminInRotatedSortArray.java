package geeksForGeeks.Arrays.contest;

public class FindminInRotatedSortArray {

    public static int findMin(int[] nums) {

            if(nums.length==0)
                return 0;
            int left=0,right=nums.length-1;
            int min=Integer.MAX_VALUE;
            while(left<=right){
                int mid=left+(right-left)/2;
               if(min>nums[mid]){
                   min=nums[mid];
                   if(nums[right]>=nums[mid]){
                       left=mid+1;
                   }
                   else{
                       right=mid-1;
                   }
               }
               else{
                   if(nums[mid]<=nums[right]){
                       left=mid+1;
                   }
                   else
                       right=mid-1;
               }
                if(nums[mid]<min)
                    min=nums[mid];
            }
            return min;

    }




    public static void main(String[] args) {
        int[] num=new int[]{3,4,5,2};
        int l=findMin(num);
        System.out.println(l);
    }

}
