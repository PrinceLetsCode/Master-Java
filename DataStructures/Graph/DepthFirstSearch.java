package DataStructures.Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DepthFirstSearch {

    boolean []visited;

    DepthFirstSearch(int V)
    {
        visited=new boolean[V];
        for (int i = 0; i < V; i++) {
            visited[i]=false;
        }
    }

    void DepthFirstTraversal(int vertex, LinkedList<Integer>[] adjList) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        Iterator<Integer> ite = adjList[vertex].listIterator();
        while (ite.hasNext()) {
            int next = ite.next();
            if (!visited[next])
                DepthFirstTraversal(next,adjList);
        }
    }

    public static void main(String[] args) {
        int V=8;
        Graph graph = new Graph(V);
        DepthFirstSearch dfs = new DepthFirstSearch(V);

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(5,6);
        graph.addEdge(6,7);

        int count=0;
        for (int i = 0; i < V; i++) {
            if (!dfs.visited[i]){
            count++;
            dfs.DepthFirstTraversal(i,graph.adjList);}
        }

        System.out.println();
        System.out.println("No of connected components :"+ count);
    }
}
