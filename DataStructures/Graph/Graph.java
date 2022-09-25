package DataStructures.Graph;

import java.util.LinkedList;
import java.util.ListIterator;

public class Graph {

    LinkedList<Integer>[] adjList;
    int V;

    public Graph(int V) {
        this.V = V;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    void addEdge(int u, int v) {
        adjList[u].add(v);
        adjList[v].add(u);
    }

    void removeEdge(int u,int v)
    {
        ListIterator<Integer> Uiter=adjList[u].listIterator();
        while (Uiter.hasNext())
        {
            int next=Uiter.next();
            if (next == v) {
                Uiter.remove();
            }
        }

        ListIterator<Integer> Viter=adjList[v].listIterator();
        while (Viter.hasNext())
        {
            int next=Viter.next();
            if (next == u) {
                Viter.remove();
            }
        }

    }

    void showGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print("vertex:" + i + " -> ");
            for (int neighbour : adjList[i]) {
                System.out.print(neighbour + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

    }
}
