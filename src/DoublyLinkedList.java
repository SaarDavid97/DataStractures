class DoublyLinkedList {
    //A node class for doubly linked list
    //Initially, head and tail is set to null
    GraphNode head, tail = null;




    //add a node to the list  
    public GraphNode addNode(int nodeKey) {
        //Create a new node  
        GraphNode newGraphNode = new GraphNode(nodeKey);

        //if list is empty, head and tail points to newNode  
        if(head == null) {
            head = tail = newGraphNode;
            //head's previous will be null  
            head.previous = null;
            //tail's next will be null  
            tail.next = null;
        }
        else {
            //add newNode to the end of list. tail->next set to newNode  
            tail.next = newGraphNode;
            //newNode->previous set to tail
            newGraphNode.previous = tail;
            //newNode becomes new tail  
            tail = newGraphNode;
            //tail's next point to null  
            tail.next = null;
        }
        return newGraphNode;
    }

    //print all the nodes of doubly linked list
    public void printNodes() {
        //Node current will point to head  
        GraphNode current = head;
        if(head == null) {
            System.out.println("Doubly linked list is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while(current != null) {
            //Print each node and then go to next.  
            System.out.print(current.key + " ");
            current = current.next;
        }
    }
}
class Main{
    public static void main(String[] args) {
        //create a DoublyLinkedList object
        DoublyLinkedList dl_List = new DoublyLinkedList();
        //Add nodes to the list  
        dl_List.addNode(10);
        dl_List.addNode(20);
        dl_List.addNode(30);
        dl_List.addNode(40);
        dl_List.addNode(50);

        //print the nodes of DoublyLinkedList  
        dl_List.printNodes();
    }
}  