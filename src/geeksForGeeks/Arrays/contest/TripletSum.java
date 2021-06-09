package geeksForGeeks.Arrays.contest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletSum {
    public  static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> list=new ArrayList<>();
        int end=nums.length-1;
        String abc="eeee";
        //abc.sub

        int start=0,firstNum=0,sum=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            start=i+1;
            end=nums.length-1;
            firstNum=nums[i];
            List<Integer> subList =new ArrayList<>();
            while(start<end){
                subList=new ArrayList<>();
                sum=nums[start]+nums[end];
                if(sum<-firstNum){
                    start++;
                }
                else if(sum>-firstNum){
                    end--;
                }
                else{
                    subList.add(firstNum);
                    subList.add(nums[start]);
                    subList.add(nums[end]);
                    int oldStart=start;
                     int oldEnd=end;
                    list.add(subList);
                    while(start<end && nums[start]==nums[oldStart]){
                        start++;
                    }
                    while(end>start && nums[end]==nums[oldEnd]){
                        end--;
                    }
                    while (i + 1 < nums.length
                            && nums[i + 1] == nums[i]) {
                        ++i;
                    }
                }


            }


        }
        return list;

    }

    public static void main(String[] args) {
        int[] nums=new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> list=TripletSum.threeSum(nums);
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).size();j++){
                System.out.println(list.get(i).get(j));
            }
        }
    }
}
