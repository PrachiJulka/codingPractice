package geeksForGeeks.Arrays.contest;

import java.util.Arrays;

public class MinNumber {
    public static int findMinFibonacciNumbers(int k) {
            int t1=0,t2=1,l=0,count=-1,count1=0,sum=0;
            boolean flag=false;
            int[] num=new int[k];
            //num[0]=1;
        int sum1=0;
        int[] nums=new int[]{2,3,5,8,13};
        Arrays.sort(nums);
            for (int i = 1; sum1 >= k; ++i)
            {

                 sum1 = t1 + t2;

                t1 = t2;
                num[l]=t1;
                t2 = sum1;
                l++;
            }

            for (int i=nums.length-1;i>=0;i--){
               if(nums[i]<=k){
                   k-=nums[i];
                   System.out.println(nums[i]);
                }
               if(k==0)
                   return count;
            }
        //System.out.println(count+" "+count1);
            return count;

    }

    public static void main(String[] args) {
       int h= findMinFibonacciNumbers(19);
        System.out.println(h);
    }


}
