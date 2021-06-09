package geeksForGeeks.Arrays.backTracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    List<List<Integer>> results=new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        results=new ArrayList<>();
        for (int i=0;i<candidates.length;i++) {
            dfs(candidates, target, i, 0, new ArrayList<>());
        }

        return results;
    }

    public void dfs(int[] candidates,int target,int index,int sum,List<Integer> subList){
        if(index>=candidates.length)
            return;
        sum+=candidates[index];
        if(sum<=target)
            subList.add(candidates[index]);

        if(sum==target){
            results.add(new ArrayList<>(subList));
           // return;
        }
        if(sum>target)
            return;

        for(int i=index;i<candidates.length;i++){
            dfs(candidates,target,i,sum,subList);
         //   index=i;
            dfs(candidates,target,++i,sum,subList);

      }
        subList.remove(subList.size()-1);

    }

    public static void main(String[] args) {
        new CombinationSum().combinationSum(new int[]{6,8,1},8);
    }
}
