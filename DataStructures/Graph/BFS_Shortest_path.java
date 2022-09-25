package DataStructures.Graph;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.LinkedList;

public class BFS_Shortest_path {


    boolean[] visited;
    int[] dist;
    int[] pred;

    BFS_Shortest_path(int v) {
        visited = new boolean[v];
        dist = new int[v];
        pred = new int[v];

        for (int i = 0; i < v; i++) {
            visited[i] = false;
            dist[i] = Integer.MAX_VALUE;
            pred[i] = -1;
        }
    }


    void printShortestDistance(LinkedList<Integer>[] adjList, int s, int dest, int v) {


        if (Bfs(adjList, s, dest, v, pred, dist) == false) {
            System.out.println("Given source and destination" +
                    " are not connected");
            return;
        }

        // LinkedList to store path
        LinkedList<Integer> path = new LinkedList<Integer>();
        int crawl = dest;
        path.add(crawl);
        while (pred[crawl] != -1) {
            path.add(pred[crawl]);
            crawl = pred[crawl];
        }

        // Print distance
        System.out.println("Shortest path length is: " + dist[dest]);

        // Print path
        System.out.println("Path is ::");
        for (int i = path.size() - 1; i >= 0; i--) {
            System.out.print(path.get(i) + " ");
        }
    }


    boolean Bfs(LinkedList<Integer>[] adjList, int s, int dest, int v, int[] pred, int[] dist) {
        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true;
        dist[s] = 0;
        queue.add(s);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            Iterator<Integer> iterator = adjList[current].listIterator();
            while (iterator.hasNext()) {
                int next = iterator.next();
                if (!visited[next]) {
                    visited[next] = true;
                    dist[next] = dist[current] + 1;
                    pred[next] = current;
                    queue.add(next);

                    if (next == dest)
                        return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 8;
        Graph graph = new Graph(v);

        BFS_Shortest_path bfs_shortest_path = new BFS_Shortest_path(v);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,2);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(4,5);
        graph.addEdge(5,6);
        graph.addEdge(6,7);

        bfs_shortest_path.printShortestDistance(graph.adjList,0,7,v);


    }
}
