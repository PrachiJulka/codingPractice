package geeksForGeeks.Arrays.backTracking;

import java.util.ArrayList;
import java.util.List;

public class SubsetsPro {
    List<List<Integer>> results;
    public List<List<Integer>> subsets(int[] nums) {
        results = new ArrayList<>();
        for (int i=0;i<=nums.length;i++){
            dfs(nums,new ArrayList<>(),0,i);
        }
        return results;

    }

    void dfs(int[] nums,List<Integer> subList,int index,int current){
        if(nums.length<index)
            return;

        if(subList.size()==current){
            results.add(new ArrayList<>(subList));
            return;
        }
        for (int i=index;i<nums.length;i++){
            subList.add(nums[i]);
            dfs(nums,subList,i+1,current);
             subList.remove(subList.size()-1);
        }
    }

    public static void main(String[] args) {
        new SubsetsPro().subsets(new int[]{1,2,3});
    }
}
