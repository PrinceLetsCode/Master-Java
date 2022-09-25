package DataStructures.Graph;

import java.util.ArrayList;

public class AdjacencyList {
    int V;
    ArrayList<ArrayList<Integer>> adjList;

    public
        AdjacencyList(int V)
        {
            this.V=V;
            adjList = new ArrayList<ArrayList<Integer>>(V);
            for (int i = 0; i < V; i++) {
                adjList.add(new ArrayList<Integer>());
            }
        }

        void addEdge(int u,int v)
        {
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        void printAdjList(int v)
        {
            for (int i=0;i<v;i++)
            {
                System.out.print("Vertex"+i+"->");
                for(int neighbour:adjList.get(i))
                {
                    System.out.print(neighbour+", ");
                }
                System.out.println();
            }
        }



    public static void main(String[] args) {
            int v=6;
            AdjacencyList adjList=new AdjacencyList(v);

            adjList.addEdge(0,2);
            adjList.addEdge(1,3);
            adjList.addEdge(1,4);
            adjList.addEdge(3,2);
            adjList.addEdge(4,2);
            adjList.addEdge(5,2);
            adjList.printAdjList(v);
    }
}
