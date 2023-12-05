package slll;


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
    
    public Node getHead() {
    	return (this.head);
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
    	if(pos < 1 || pos > (getNodesCount() + 1))
    		throw new RuntimeException("Invalid position");
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
    
    public void deleteNodeAtFirstPosition() {
    	if(isListEmpty())
    		throw new RuntimeException("list is empty !!!");
    	
    	if(head.next == null) 
    		head = null;
    	else 
    		head = head.next;
    	
    	nodeCount--;
    }
    
    public void deleteNodeAtLastPosition() {
    	if(isListEmpty())
    		throw new RuntimeException("list is empty !!!");
    	
    	if(head.next == null) 
    		head = null;
    	else {
    		Node trav = head;
    		
    		while(trav.next.next != null) 
    			trav = trav.next;
    		trav.next = null;
    		nodeCount--;
    	}
    		
    }
    
    public void deleteNodeAtSpecificPosition(int pos) {
    	if(isListEmpty())
    		throw new RuntimeException("list is empty !!!");
    	if(pos < 1 || pos > getNodesCount())
    		throw new RuntimeException("Invalid position");
    	if(pos == 1)
    		deleteNodeAtFirstPosition();
    	else if(pos == getNodesCount())
    		deleteNodeAtLastPosition();
    	else {
    		Node trav = head;
    		int i = 1;
    		
    		while(i < pos - 1) {
    			i++;
    			trav = trav.next;
    		}
    		
    		trav.next = trav.next.next;
    		nodeCount--;
    	}
    }
    
    public void displayLinkedListReverse() {
    	displayLinkedListReverse(head);
    }
    
    public void displayLinkedListReverse(Node trav) {
    	if(trav == null)
    		return;
    	
    	displayLinkedListReverse(trav.next);
    	System.out.print(" -> "+trav.data);
    }
    
    public void reverseLinkedList() {
    	if(isListEmpty())
    		throw new RuntimeException("List is empty !!!");
    	
    	Node t1 = head;
    	Node t2 = t1.next;
    	t1.next = null;
    	
    	while(t2 != null) {
    		Node t3 = t2.next;
    		t2.next = t1;
    		t1 = t2;
    		t2 = t3;
    	}
    	head = t1;
    }
    
    public boolean searchNodeAndDelete(int data) {
    	if(isListEmpty())
    		throw new RuntimeException("List is empty !!!");
    	
    	Node[] temp = {null, null};
    	
    	if(!searchNode(data, temp))
    		return false;
    	
    	if(temp[0] == null) {
    		System.out.println("Element ("+temp[0].data+") found at first position");
    		head = temp[0].next;
    	}
    	else {
    		System.out.println("Previous element : "+temp[0].data);
    		System.out.println("Current element : "+temp[1].data);
    		temp[0].next = temp[1].next;
    	}
    	nodeCount--;
    	return true;
    }
    
    public boolean searchNode(int data, Node[] temp) {
    	
    	for(Node trav = head ; trav != null ; trav = trav.next) {
    		if(data == trav.data) {
    			temp[1] = trav;
    			return true;
    		}
    		temp[0] = trav;
    	}
    	return false;
    }
}















