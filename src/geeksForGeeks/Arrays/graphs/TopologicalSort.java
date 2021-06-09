package geeksForGeeks.Arrays.graphs;

import java.util.ArrayList;
import java.util.List;

public class TopologicalSort {

    List<List<Integer>> adj;
    int n;
    List<Integer> indegree;
    List<Integer> ans;

    public TopologicalSort(List<List<Integer>> adj, int n) {
        adj=new ArrayList<>();
        indegree=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
            indegree.add(0);
        }
        this.n = n;
    }

    public void sort(){
        for (int i=0;i<n;i++){
            for (int j=0;j<adj.get(i).size();j++) {
                indegree.set(adj.get(i).get(j),indegree.get(adj.get(i).get(j))+1);
            }
        }



    }

    public static void main(String[] args) {
        Float f=new Float("3.0");
        int c=f.intValue();
        byte d=f.byteValue();
        double c1=f.doubleValue();
        System.out.println(c+d+c1);
        StringBuilder stringBuilder=new StringBuilder("rrrr");
    }
}
