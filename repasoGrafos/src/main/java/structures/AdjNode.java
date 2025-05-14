package structures;

// Node to store adjacency list
class AdjNode {
    int vertex;
    AdjNode next;

    public AdjNode(int data)
    {
        vertex = data;
        next = null;
    }
}