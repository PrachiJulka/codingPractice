package geeksForGeeks.Arrays.graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DFSIterative {
    public void dfs(int s, boolean[] visited, List<LinkedList<Integer>> lists){
        visited[s]=true;
        Iterator<Integer> iterator=lists.get(s).listIterator();
        while (iterator.hasNext()){
            int val=iterator.next();
            if(!visited[val]){
//                dfs(val,visited);
            }
        }
    }

    public static void main(String[] args) {
        DFS bfs=new DFS(4);
        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(1, 2);
        bfs.addEdge(2, 0);
        bfs.addEdge(2, 3);
        bfs.addEdge(3, 3);

//        bfs.dfs();
    }
}
