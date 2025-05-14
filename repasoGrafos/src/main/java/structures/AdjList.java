package structures;

// Adjacency List representation

public class AdjList {
    private int v;
    private AdjNode[] graph;

    public AdjList(int vertices) {
        v = vertices;
        graph = new AdjNode[v];
        for (int i = 0; i < v; ++i) {
            graph[i] = null;
        }
    }

    // Function to add an edge from a source vertex
    // to a destination vertex
    public void addEdge(int source, int destination) {
        AdjNode node = new AdjNode(destination);
        node.next = graph[source];
        graph[source] = node;
    }

    // Function to add a vertex between two vertices
    public void addVertex(int vk, int source,
                          int destination) {
        addEdge(source, vk);
        addEdge(vk, destination);
    }

    // Function to print the graph
    public void printGraph() {
        for (int i = 0; i < v; ++i) {
            System.out.print(i + " ");
            AdjNode temp = graph[i];
            while (temp != null) {
                System.out.print("-> " + temp.vertex + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Function to delete a vertex
    public void delVertex(int k) {
        // Iterate through all the vertices of the graph
        for (int i = 0; i < v; ++i) {
            AdjNode curr = graph[i], prev = null;

            if (i == k) {
                graph[i] = null;
            } else {
                while (curr != null) {
                    if (curr.vertex == k) {
                        if (prev == null) {
                            // If k is at the start of the list, remove it
                            graph[i] = curr.next;
                        } else {
                            // If k is in the middle or end, remove it
                            prev.next = curr.next;
                        }
                        break;
                    }
                    prev = curr;
                    curr = curr.next;
                }
            }
        }
    }
}



