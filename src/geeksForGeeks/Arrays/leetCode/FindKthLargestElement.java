package geeksForGeeks.Arrays.leetCode;

import java.util.ArrayList;
import java.util.List;

public class FindKthLargestElement {
    public static int findKthLargest(int[] nums, int k) {
        List<Integer> list=new ArrayList<>();
        if(nums.length==0)
            return -1;
        boolean flag=false;
        for(int i=0;i<nums.length;i++){
            flag=false;
            if(!list.isEmpty()){
                for(int j=0;j<list.size();j++){
                    if(list.get(j)<=nums[i] ){
                        list.add(j,nums[i]);
                        flag=true;
                        break;
                    }

                }
                if(!flag)
                    list.add(nums[i]);
            }
            else{
                list.add(nums[i]);
            }
        }
        return list.get(k-1);


    }

    public static void main(String[] args) {
       int y= findKthLargest(new int[]{3,2,3,1,2,4,5,5,6 },9);
        System.out.println(y);
    }
}
