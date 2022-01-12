public class GraphNode {

    public int key;
    public GraphNode next;
    public GraphNode previous;
    //public DoublyLinkedList adjList;
    //needs list of edges he is in

    public GraphNode(int key) {
        this.key = key;
        this.next = null;
        this.previous = null;
    }


    public int getOutDegree(){
        int count = 0;
        GraphNode temp = this.next;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public int getInDegree(){
        int count = 0;
        GraphNode temp = this.previous;
        while (temp != null)
        {
            count++;
            temp = temp.previous;
        }
        return count;
    }

    public int getKey(){
        return this.key;
    }
}
