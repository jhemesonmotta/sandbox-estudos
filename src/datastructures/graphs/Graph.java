package datastructures.graphs;

import java.util.ArrayList;
import java.util.List;

class Graph {
    private int numVertices;
    private List<List<Integer>> adjacencyList;

    // Construtor
    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    // Adiciona uma aresta
    public void addEdge(int v, int w) {
        adjacencyList.get(v).add(w);
        adjacencyList.get(w).add(v);
    }

    // Exibe as conexões
    public void printConnections() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print(i + ": ");
            for (int j : adjacencyList.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(4); // 4 vértices
        g.addEdge(0, 1); // Alice conhece Bob
        g.addEdge(0, 2); // Alice conhece Carol
        g.addEdge(1, 2); // Bob conhece Carol
        g.addEdge(2, 3); // Carol conhece Dave

        g.printConnections();
    }
}
