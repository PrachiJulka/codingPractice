package geeksForGeeks.Arrays.backTracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permutations {
    List<List<Integer>> results;
    public List<List<Integer>> permute(int[] nums) {
        results=new ArrayList<>();
        List<Integer> subResults=new ArrayList<>();
        backTrack(subResults,nums);
        return results;
    }

    public void backTrack(List<Integer> subResults, int[] nums){
        if(nums.length==subResults.size()){
            results.add(new ArrayList<>(subResults));
            return;
        }

        for(int i=0;i<nums.length;i++){

            if(!subResults.contains(nums[i])){
                subResults.add(nums[i]);
                backTrack(subResults,nums);
                subResults.remove(subResults.size()-1);
            }



        }

    }

    public static void main(String[] args) {
        new Permutations().permute(new int[]{1,2,3});
    }
}
