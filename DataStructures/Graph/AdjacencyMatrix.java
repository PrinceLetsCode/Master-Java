package DataStructures.Graph;

public class AdjacencyMatrix {

    int V;
    int[][] adjMatrix;

    public AdjacencyMatrix(int V)
    {
        this.V = V;
        adjMatrix = new int[V][V];
        for (int i = 0; i < V; i++)
        {
            for (int j = 0; j < V; j++)
            {
                adjMatrix[i][j] = 0;
            }
        }
    }

    void addEdge(int u, int v) {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
    }

    void showMatrix(int v) {
        for (int i = 0; i < v; i++) {
            System.out.print("vertex " + i + "-> ");
            for (int neighbour : adjMatrix[i]) {
                System.out.print(neighbour + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int v = 6;
        AdjacencyMatrix adjMat = new AdjacencyMatrix(v);

        adjMat.addEdge(1, 3);
        adjMat.addEdge(2, 3);
        adjMat.addEdge(4, 3);
        adjMat.addEdge(1, 2);
        adjMat.addEdge(1, 5);
        adjMat.addEdge(5, 3);
        adjMat.showMatrix(v);
    }

}
