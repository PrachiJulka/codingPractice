package geeksForGeeks.Arrays.backTracking;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    List<List<Integer>> results;
    public List<List<Integer>> combinationSum3(int k, int n) {
        results=new ArrayList<>();
        dfs(k,1,n,new ArrayList<>());
        return results;
    }

    public  void dfs(int k,int index,int n,List<Integer> subList){
       if(n==0 && k==0){
           results.add(new ArrayList<>(subList));
           return;
       }
       if (n<0 || k==0)
           return;


       for (int i=index;i<=9;i++){
           subList.add(i);
           dfs(k-1,i+1,n-i,subList);
           subList.remove(subList.size()-1);
       }
    }

    public static void main(String[] args) {
        new CombinationSumIII().combinationSum3(3,7);
    }
}
