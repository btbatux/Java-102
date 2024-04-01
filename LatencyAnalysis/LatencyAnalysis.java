package LatencyAnalysis;

import java.util.*;

public class LatencyAnalysis {

    static class Edge {
        int from;
        int to;
        int weight;

        public Edge(int from, int to, int weight) {
            this.from = from;
            this.to = to;
            this.weight = weight;
        }
    }

    static class Graph {
        int nodes;
        List<Edge> edges;

        public Graph(int nodes, List<Edge> edges) {
            this.nodes = nodes;
            this.edges = edges;
        }
    }

    public static int minMaxLatency(int g_nodes, int[] g_from, int[] g_to, int[] g_weight, int k) {
        // Graf oluşturma
        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < g_from.length; i++) {
            edges.add(new Edge(g_from[i], g_to[i], g_weight[i]));
        }
        Graph graph = new Graph(g_nodes, edges);

        // Maksimum gecikmeleri hesaplama
        int[] maxLatencies = new int[g_nodes];
        Arrays.fill(maxLatencies, -1);
        for (int i = 0; i < g_nodes; i++) {
            boolean[] visited = new boolean[g_nodes];
            bfs(graph, i, visited, maxLatencies);
        }

        // Bağlantıları gecikmelerine göre sıralama
        Collections.sort(graph.edges, (a, b) -> Integer.compare(b.weight, a.weight));

        // Bağlantıları kaldırarak alt ağları oluşturma ve maksimum gecikmeleri
        // hesaplama
        int minMaxLatency = Integer.MAX_VALUE;
        for (int i = 0; i < graph.edges.size(); i++) {
            Graph newGraph = removeEdge(graph, i);
            int[] newMaxLatencies = new int[k];
            Arrays.fill(newMaxLatencies, -1);
            for (int j = 0; j < newGraph.nodes; j++) {
                boolean[] visited = new boolean[newGraph.nodes];
                bfs(newGraph, j, visited, newMaxLatencies);
            }
            int max = Arrays.stream(newMaxLatencies).max().getAsInt();
            minMaxLatency = Math.min(minMaxLatency, max);
        }

        return minMaxLatency;
    }

    private static void bfs(Graph graph, int node, boolean[] visited, int[] maxLatencies) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(node);
        visited[node] = true;
        int maxLatency = 0;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            for (Edge edge : graph.edges) {
                if (edge.from == curr && !visited[edge.to]) {
                    maxLatency = Math.max(maxLatency, edge.weight);
                    queue.offer(edge.to);
                    visited[edge.to] = true;
                } else if (edge.to == curr && !visited[edge.from]) {
                    maxLatency = Math.max(maxLatency, edge.weight);
                    queue.offer(edge.from);
                    visited[edge.from] = true;
                }
            }
        }
        maxLatencies[node] = maxLatency;
    }

    private static Graph removeEdge(Graph graph, int index) {
        List<Edge> newEdges = new ArrayList<>(graph.edges);
        newEdges.remove(index);
        return new Graph(graph.nodes, newEdges);
    }

    public static void main(String[] args) {
        int g_nodes = 3;
        int[] g_from = { 1, 2, 3 };
        int[] g_to = { 2, 3, 1 };
        int[] g_weight = { 4, 5, 3 };
        int k = 2;

        int result = minMaxLatency(g_nodes, g_from, g_to, g_weight, k);
        System.out.println("Minimum possible value of the maximum max-latency: " + result);
    }
}
