public class DynamicGraph {

    // list of nodes
    DoublyLinkedList edgesList;
    DoublyLinkedList nodesList;
    //list of edges

    public DynamicGraph(){
        edgesList = new DoublyLinkedList();
        nodesList = new DoublyLinkedList();
    }

    public GraphNode insertNode(int nodeKey){
        GraphNode newGraphNode = nodesList.addNode(nodeKey);
        return newGraphNode;
    }

    public void deleteNode(GraphNode node){

        //check if there are edges with node
        //if not, deletes node
    }



}
