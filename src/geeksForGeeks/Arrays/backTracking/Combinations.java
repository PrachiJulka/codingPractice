package geeksForGeeks.Arrays.backTracking;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    List<List<Integer>> results;
    public List<List<Integer>> combine(int n, int k) {
        results=new ArrayList<>();
        dfs(n,k,0,new ArrayList<>());
        return results;
    }

    void dfs(int n,int k,int index,List<Integer> subList){


        if(subList.size()==k){
            results.add(new ArrayList<>(subList));
            return;
        }

        for(int i=index+1;i<=n;i++){
            if(index==i || i!=i-1){
                subList.add(i);
                dfs(n,k,i,subList);
                subList.remove(subList.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        new Combinations().combine(4,2);
    }

}
