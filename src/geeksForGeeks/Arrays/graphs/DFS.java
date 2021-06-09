package geeksForGeeks.Arrays.graphs;

import sun.reflect.generics.visitor.Visitor;

import java.util.*;

public class DFS {
    // No. of vertices
    private int V;

    // Adjacency List Represntation
    private LinkedList<Integer> adj[];

    public DFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    public void addEdge(int v, int e) {
        adj[v].add(e);
//        adj[e].add(v);
    }

//    public void dfs(int s, boolean[] visited) {
//        visited[s] = true;
//        System.out.println(s);
//        Iterator<Integer> iterator = lists.get(s).listIterator();
//        while (iterator.hasNext()) {
//            int val = iterator.next();
//            if (!visited[val]) {
//                dfs(val, visited);
//            }
//        }
//    }

//    public void dfsIterative(int s, boolean[] visited) {
//        Stack<Integer> stack = new Stack<>();
////        visited[s] = true;
//        stack.push(s);
//        while (!stack.empty()) {
//            Integer i = stack.pop();
//            if (!visited[i]) {
//                visited[i] = true;
//                System.out.println(i);
//            }
//            Iterator<Integer> iterator = adj[i].listIterator();
//            while (iterator.hasNext()) {
//                int val = iterator.next();
//                if (!visited[val]) {
//                    stack.push(val);
//                }
//            }
//        }
//    }


    public boolean detectCycleInUndirectedGraph() {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (isCycleUtils(i, visited, -1)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isCycleUtils(int s, boolean[] visited, int parent) {
        visited[s] = true;
        for (int i = 0; i < adj[s].size(); i++) {
            if (visited[adj[s].get(i)]) {
                if (parent != adj[s].get(i)) {
                    return true;
                }

            } else {
                if (isCycleUtils(adj[s].get(i), visited, s)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean detectCycleInDirectedGraph() {
        boolean[] visited = new boolean[V];
        boolean[] inStack = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (isDirectedCycleUtil(i, visited, inStack)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isDirectedCycleUtil(int s, boolean[] visited, boolean[] inStack) {
        visited[s] = true;
        inStack[s] = true;
        for (int i = 0; i < adj[s].size(); i++) {
            if (visited[adj[s].get(i)] && inStack[adj[s].get(i)]) {
                return true;
            } else {
                if (isDirectedCycleUtil(adj[s].get(i), visited, inStack)) {
                    return true;
                } else {
                    inStack[adj[s].get(i)] = false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DFS bfs = new DFS(6);
        bfs.addEdge(1, 2);
        bfs.addEdge(2,3);
        bfs.addEdge(3, 4);
        bfs.addEdge(4, 5);
        bfs.addEdge(5,4);
//        bfs.addEdge(3, 4);
//
//        bfs.addEdge(4, 5);
//        bfs.addEdge(5,2);

//        bfs.dfs(2, new boolean[lists.size()]);
        System.out.println("Iterative approach");
//        bfs.dfsIterative(2, new boolean[lists.size()]);
        System.out.println("Cycle detection");
        boolean result = bfs.detectCycleInUndirectedGraph();
        System.out.println(result);
        System.out.println("directed"+bfs.detectCycleInDirectedGraph());
    }
}
