package ui;

import structures.AdjList;

    public class Main {
        public static void main(String[] args) {
            int V = 6;
            AdjList graph = new AdjList(V);
            graph.addEdge(0, 1);
            graph.addEdge(0, 3);
            graph.addEdge(0, 4);
            graph.addEdge(1, 2);
            graph.addEdge(3, 2);
            graph.addEdge(4, 3);

            System.out.println("Initial adjacency list");
            graph.printGraph();

            // Add vertex
            graph.addVertex(5, 3, 2);
            System.out.println("Adjacency list after adding vertex");
            graph.printGraph();

            // Delete vertex
            graph.delVertex(4);
            System.out.println("Adjacency list after deleting vertex");
            graph.printGraph();
        }
    }
