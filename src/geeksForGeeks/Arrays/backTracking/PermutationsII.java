package geeksForGeeks.Arrays.backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {
    List<List<Integer>> results;
    public List<List<Integer>> permuteUnique(int[] nums) {
        results=new ArrayList<>();
        boolean[] visited=new boolean[nums.length];
        List<Integer> list=new ArrayList<>();
        permute(list,nums,visited);

    return results;
    }

    void permute(List<Integer> list,int[] nums,boolean[] visited){
        if(list.size()==nums.length && !results.contains(list)){
            results.add(new ArrayList<>(list));
        }

        for (int i=0;i<nums.length;i++){
            if(!visited[i]){
                visited[i]=true;
                list.add(nums[i]);
                permute(list,nums,visited);
                visited[i]=false;
                list.remove(list.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        new PermutationsII().permuteUnique(new int[]{1,1,2});
    }
}
