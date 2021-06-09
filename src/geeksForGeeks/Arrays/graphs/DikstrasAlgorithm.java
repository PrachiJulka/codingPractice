package geeksForGeeks.Arrays.graphs;

import geeksForGeeks.Arrays.heap.MaxHeap;

import java.util.*;

public class DikstrasAlgorithm {

    int[][] adjMatrix;
    int nodesSize;
    Queue<Vertex> priorityQueue;
    boolean[] visited;
    int[][] adjMatrixResult;
    int[] markedValue;
    Map<Integer, List<Integer>> edges;

    public DikstrasAlgorithm(int nodesSize) {
        this.adjMatrix = new int[nodesSize][nodesSize];
        this.nodesSize = nodesSize;
        priorityQueue = new PriorityQueue<>();
        visited = new boolean[nodesSize];
        adjMatrixResult = new int[nodesSize][nodesSize];
        markedValue=new int[nodesSize];
        edges=new HashMap<>();
    }

    public void addEdge(int src, int dest, int val) {
        adjMatrix[src][dest] = val;
        adjMatrix[dest][src] = val;
    }


    public void shortestPath(int s) {
        priorityQueue.add(new Vertex(s, 0, 0));
        markedValue[s]=0;
        while (!priorityQueue.isEmpty()) {
            Vertex vertex = priorityQueue.remove();
            visited[vertex.dest] = true;
            for (int i = 0; i < 6; i++) {
                if (!visited[i] && adjMatrix[vertex.dest][i]<Integer.MAX_VALUE) {
                    int total = adjMatrix[vertex.dest][i] + vertex.weight;
                    if (markedValue[i] >= total) {
                        adjMatrixResult[vertex.dest][i] = total;
                        if(markedValue[i]>total){
                            markedValue[i]=total;
                        }
                    }
                    priorityQueue.add(new Vertex(vertex.dest, i, total));
                }
            }
        }
    }


    public static void main(String[] args) {
        DikstrasAlgorithm dikstrasAlgorithm = new DikstrasAlgorithm(6);
        for (int i = 0; i < 6; i++) {
            dikstrasAlgorithm.markedValue[i]=Integer.MAX_VALUE;
            for (int j = 0; j < 6; j++) {
                if(i==j){
                    dikstrasAlgorithm.adjMatrix[i][j]=0;
                    dikstrasAlgorithm.adjMatrixResult[i][j]=0;
                }
                else {
                    dikstrasAlgorithm.adjMatrix[i][j] = Integer.MAX_VALUE;
                    dikstrasAlgorithm.adjMatrixResult[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        dikstrasAlgorithm.addEdge(0,0,0);
        dikstrasAlgorithm.addEdge(0,1,2);
        dikstrasAlgorithm.addEdge(0,2,3);
        dikstrasAlgorithm.addEdge(1,3,4);
        dikstrasAlgorithm.addEdge(2,4,5);
        dikstrasAlgorithm.addEdge(4,5,7);
        dikstrasAlgorithm.addEdge(3,5,6);
        dikstrasAlgorithm.addEdge(2,3,1);
        dikstrasAlgorithm.shortestPath(0);
        for (int i=0;i<6;i++){
                System.out.println("source "+0+" destination "+i+" weight "+dikstrasAlgorithm.markedValue[i]);
        }
    }
}

class Vertex implements Comparable<Vertex> {
    int src;
    int dest;
    int weight;

    public Vertex(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public int compareTo(Vertex o) {
        if (this.weight < o.weight) {
            return -1;
        }
        if (this.weight > o.weight)
            return 1;

        return 0;
    }
}