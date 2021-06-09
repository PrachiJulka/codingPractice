package geeksForGeeks.Arrays.graphs;

import java.util.*;

public class BFS {

    List<LinkedList<Integer>> lists=new ArrayList<>();
    public BFS(int v){
        for(int i=0;i<v;i++){
            lists.add(new LinkedList<>());
        }
    }

    public void addEdge(int v,int e){
        lists.get(v).add(e);
    }

    public void bfs(int s){
        LinkedList<Integer> queue=new LinkedList();
        boolean[] visited= new boolean[lists.size()];
        queue.add(s);
        visited[s]=true;
        while(queue.size()!=0){
            s=queue.poll();
            System.out.println("list"+s);
            Iterator<Integer> iterator=lists.get(s).listIterator();
            while (iterator.hasNext()){
                int n= iterator.next();
                if (!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS bfs=new BFS(4);
        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(1, 2);
        bfs.addEdge(2, 0);
        bfs.addEdge(2, 3);
        bfs.addEdge(3, 3);

        bfs.bfs(2);
    }
}
