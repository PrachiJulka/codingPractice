package geeksForGeeks.Arrays.backTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationsII {
    List<List<Integer>> results;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        results = new ArrayList<>();
        Arrays.sort(candidates);
//        for (int i = 0; i < candidates.length; i++) {
            dfs(candidates, target, 0, new ArrayList<>());
//        }
        return results;
    }

    void dfs(int[] candidates, int target, int index, List<Integer> subList) {
      if(target==0){
          results.add(new ArrayList<>(subList));
          return;
      }

      if(target<0)
          return;

      for (int i=index;i<candidates.length;i++){
          if(index==i || candidates[i]!=candidates[i-1]){
              subList.add(candidates[i]);
              dfs(candidates,target-candidates[i],i+1,subList);
              subList.remove(subList.size()-1);
         }
      }
    }

    public static void main(String[] args) {
        new CombinationsII().combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
    }
}
