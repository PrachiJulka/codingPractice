package geeksForGeeks.Arrays.graphs;

import java.util.*;
import java.util.stream.Collectors;

public class KruskalsAlgorithm {
    List<List<Graph>> graphs = new LinkedList<>();
    Queue<Graph> queue = new PriorityQueue<>();
    List<List<Graph>> results=new LinkedList<>();
    int v;
    boolean[] visited;
    List<Disjoint> disjoints=new ArrayList<>();

    public static void main(String[] args) {
        KruskalsAlgorithm kruskalsAlgorithm = new KruskalsAlgorithm();
        kruskalsAlgorithm.v = 8;
        kruskalsAlgorithm.visited=new boolean[kruskalsAlgorithm.v+1];
        for(int i=0;i<kruskalsAlgorithm.v;i++){
            kruskalsAlgorithm.disjoints.add(new Disjoint(-1,0));
        }
        for (int i = 0; i <= kruskalsAlgorithm.v; i++) {
            kruskalsAlgorithm.graphs.add(new LinkedList<>());
            kruskalsAlgorithm.results.add(new LinkedList<>());
        }
        kruskalsAlgorithm.graphs.get(8).add(new Graph(2, 8, 2));
        kruskalsAlgorithm.graphs.get(7).add(new Graph(1, 7, 6));
        kruskalsAlgorithm.graphs.get(6).add(new Graph(2, 6, 5));
        kruskalsAlgorithm.graphs.get(0).add(new Graph(4, 0, 1));
        kruskalsAlgorithm.graphs.get(2).add(new Graph(4, 2, 5));
        kruskalsAlgorithm.graphs.get(8).add(new Graph(6, 8, 6));
        kruskalsAlgorithm.graphs.get(2).add(new Graph(7, 2, 3));
        kruskalsAlgorithm.graphs.get(7).add(new Graph(7, 7, 8));
        kruskalsAlgorithm.graphs.get(0).add(new Graph(8, 0, 7));
        kruskalsAlgorithm.graphs.get(1).add(new Graph(8, 1, 2));
        kruskalsAlgorithm.graphs.get(3).add(new Graph(9, 3, 4));
        kruskalsAlgorithm.graphs.get(5).add(new Graph(10, 5, 4));
        kruskalsAlgorithm.graphs.get(1).add(new Graph(11, 1, 7));
        kruskalsAlgorithm.graphs.get(3).add(new Graph(14, 3, 5));


        for (List<Graph> list : kruskalsAlgorithm.graphs) {
            kruskalsAlgorithm.queue.addAll(list);
        }

        while (!kruskalsAlgorithm.queue.isEmpty()) {
            Graph graph=kruskalsAlgorithm.queue.poll();
            kruskalsAlgorithm.results.get(graph.src).add(graph);
//            if(kruskalsAlgorithm.isCycleDetected(graph,kruskalsAlgorithm.visited,graph.src)){
//                kruskalsAlgorithm.results.get(graph.src).remove(graph);
//            }
            Map<String,Integer> map=new HashMap<>();
        }

        for(List<Graph> graphs:kruskalsAlgorithm.results){
            for (Graph graph:graphs){
                System.out.println("graph: "+graph.src+" "+graph.dest+" "+graph.weight);
            }
        }
    }

//    int findAbsoluteParent(int parent,int){
//        if(this.disjoints.get())
//    }
//    public  boolean isCycleDetected(Graph graph,boolean[] visited,int parent){
//
//    }

}


class Graph implements Comparable<Graph> {
    int weight;
    int src;
    int dest;

    public Graph(int weight, int src, int dest) {
        this.weight = weight;
        this.src = src;
        this.dest = dest;
    }

    @Override
    public int compareTo(Graph o) {
        if (this.weight < o.weight) {
            return -1;
        }
        if (this.weight > o.weight) {
            return 1;
        }
        return 0;
    }
}

class Disjoint{
    int parent;
    int rank;

    public Disjoint(int parent, int rank) {
        this.parent = parent;
        this.rank = rank;
    }
}