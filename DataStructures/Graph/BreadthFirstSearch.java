package DataStructures.Graph;


import java.util.Iterator;
import java.util.LinkedList;

public class BreadthFirstSearch {


    boolean visited[];

    BreadthFirstSearch( int V) {
        visited=new boolean[V];
        for (int i = 0; i < V; i++) {
            visited[i]=false;
        }
    }

    void BreadthFirstTraversal(int vertex, LinkedList<Integer>[] adjList)
    {

        LinkedList<Integer> queue=new LinkedList<>();

        visited[vertex]=true;
        queue.add(vertex);

        while (queue.size() != 0) {
            int ver = queue.poll();
            System.out.print(ver+" ");

            Iterator<Integer> iterator = adjList[ver].listIterator();
            while (iterator.hasNext()) {
                int next = iterator.next();
                if (!visited[next]) {
                    visited[next]=true;
                    queue.add(next);
                }
            }
        }
    }


    public static void main(String[] args) {
        int V=8;
        Graph graph = new Graph(V);
        BreadthFirstSearch bfs=new BreadthFirstSearch(V);

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,3);
        graph.addEdge(1,4);
        graph.addEdge(5,6);
        graph.addEdge(6,7);


        int count=0;

        for (int i = 0; i < V; i++) {
            if (!bfs.visited[i])
            {
                count++;
                bfs.BreadthFirstTraversal(i,graph.adjList);
            }
        }
        System.out.println();
        System.out.println("No of connected components are:" + count);

    }

}
