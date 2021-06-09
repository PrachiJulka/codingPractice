package geeksForGeeks.Arrays.backTracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIV {
    List<List<Integer>> results;
    public List<List<Integer>> combinationSum4(int[] nums, int target) {
        results=new ArrayList<>();
        dfs(nums,target,0,new ArrayList<>());
        return results;
    }

    public  void dfs(int[] nums,int target,int index,List<Integer> subList){
        if (target<0){

            return;
        }


        if(target==0){
            results.add(new ArrayList<>(subList));
            return;
        }




        for (int i=0;i<nums.length;i++){
            subList.add(nums[i]);

           // target-=nums[index];
            dfs(nums,target-nums[i],i,subList);
         //   if (target>0)
            subList.remove(subList.size()-1);

         }
       // subList.remove(subList.size()-1);
    }

    public static void main(String[] args) {
        new CombinationSumIV().combinationSum4(new int[] {1,2,3},4);
    }
}
