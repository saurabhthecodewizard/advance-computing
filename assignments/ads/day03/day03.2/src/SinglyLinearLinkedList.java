class SinglyLinearLinkedList {
    static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private int nodeCount;

    public SinglyLinearLinkedList() {
        this.head = null;
        this.nodeCount = 0;
    }

    public boolean isListEmpty() {
        return (head == null);
    }

    public int getNodesCount() {
        return (this.nodeCount);
    }

    public void displayLinkedList() {
        if(isListEmpty())
            throw new RuntimeException("list is empty !!!");
        else{
            Node trav = head;

            System.out.println("No of nodes : "+getNodesCount());
            System.out.print("Singly linear linked list : head");

            while(trav != null){
                System.out.print(" -> "+trav.data);
                trav = trav.next;
            }

            System.out.println(" -> tail");
        }
        
    }

    public void addNodeAtLastPosition(int data) {

        Node newNode = new Node(data);

        if(isListEmpty()) {
            head = newNode;
            nodeCount++;
        }
        else {
            Node trav = head;
            while(trav.next != null) {
                trav = trav.next;
            }
            trav.next = newNode;
            nodeCount++;
        }
    }

    public void addNodeAtFirstPosition(int data) {
        Node newNode = new Node(data);

        if(isListEmpty()) {
            head = newNode;
            nodeCount++;
        }
        else {
            newNode.next = head;
            head = newNode;
            nodeCount++;
        }
    }

    public void addNodeAtSpecificPosition(int pos, int data) {
        if(pos == 1)
            addNodeAtFirstPosition(data);
        else if(pos == getNodesCount() + 1)
                addNodeAtLastPosition(data);
            else {
                Node newNode = new Node(data);
                Node trav = head;
                int i = 1;

                while(i < pos-1) {
                    i++;
                    trav = trav.next;
                }

                newNode.next = trav.next;
                trav.next = newNode;
                nodeCount++;
            }

        
    }
}