import java.util.*;

public class GraphImpl {
    static class Graph {
        private int vertices;
        private LinkedList<Integer>[] adjList;

        @SuppressWarnings("unchecked")
        Graph(int vertices) {
            this.vertices = vertices;
            adjList = new LinkedList[vertices];
            for (int i = 0; i < vertices; i++) {
                adjList[i] = new LinkedList<>();
            }
        }

        void addEdge(int src, int dest) {
            adjList[src].add(dest);
            adjList[dest].add(src); // undirected
        }

        void bfs(int start) {
            boolean[] visited = new boolean[vertices];
            Queue<Integer> queue = new LinkedList<>();

            visited[start] = true;
            queue.offer(start);

            System.out.print("BFS: ");
            while (!queue.isEmpty()) {
                int node = queue.poll();
                System.out.print(node + " ");

                for (int neighbor : adjList[node]) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.offer(neighbor);
                    }
                }
            }
            System.out.println();
        }

        void dfs(int start) {
            boolean[] visited = new boolean[vertices];
            System.out.print("DFS: ");
            dfsHelper(start, visited);
            System.out.println();
        }

        void dfsHelper(int node, boolean[] visited) {
            visited[node] = true;
            System.out.print(node + " ");
            for (int neighbor : adjList[node]) {
                if (!visited[neighbor]) {
                    dfsHelper(neighbor, visited);
                }
            }
        }

        void printGraph() {
            System.out.println("Adjacency List:");
            for (int i = 0; i < vertices; i++) {
                System.out.print(i + " → ");
                System.out.println(adjList[i]);
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        graph.printGraph();
        graph.bfs(0);
        graph.dfs(0);
    }
}
