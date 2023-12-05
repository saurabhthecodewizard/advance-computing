
class SinglyLinearLinkedList {
    static class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
        public Node(){
            this.data = 0;
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
    
    public void swapNodes(Node first, Node second) {
    	Node temp = first;
    	first = second;
    	second = temp;
    }
    
    public void selectionSort() {
    	if(isListEmpty())
    		throw new RuntimeException("List is empty !!!");
    	Node first = head;
    	for(int i=0; i < nodeCount - 1; i++) {
        	Node second = first.next;
            for(int j=i+1; j < nodeCount; j++) {
            	if(first.data > second.data){
                	int temp = first.data;
                	first.data = second.data;
                	second.data = temp;
                }
            	second = second.next;
            }
            first = first.next;
        }
    }
    
    public void bubbleSort() {
    	if(isListEmpty())
    		throw new RuntimeException("List is empty !!!");
    	boolean flag = true;
    	for(int i=0; i < nodeCount - 1 && flag; i++) {
    		Node first = head;
    		flag = false;
            for(int j=0; j < nodeCount - i - 1; j++) {
                if(first.data > first.next.data){
                	int temp = first.data;
                	first.data = first.next.data;
                	first.next.data = temp;
                	flag = true;
                }
                first = first.next;
            }
        }
    }
    
    public Node mergeTwoSortedLists(Node list1, Node list2) {
    	Node head = new Node();
    	Node list = head;

        while (list1 != null && list2 != null) {
            if(list1.data <= list2.data) {
                list.next = list1;
                list1 = list1.next;
            }else {
                list.next = list2;
                list2 = list2.next;
            }
            list = list.next;
        }
        if(list1 != null)
            list.next = list1;
        if(list2 != null)
            list.next = list2;

        return head.next;
    }
    
    public void addNodeInSortedManner(int data) {
    	if(isListEmpty())
    		addNodeAtFirstPosition(data);
    	Node trav = head;
    	int count = 1;
    	while(true) {
    		if(count >= nodeCount+1)
    			break;
    		if(data < trav.data)
    			break;
    		count++;
    		trav = trav.next;
    	}
    	addNodeAtSpecificPosition(count, data);
    }
    
    public void findMiddleNode() {
    	if(isListEmpty())
    		throw new RuntimeException("List is empty !!!");
    	int pos = nodeCount/2;
    	int i = 1;
    	Node trav = head;
    	while(i<pos) {
    		i++;
    		trav = trav.next;
    	}
    	System.out.println("Middle element : "+trav.data);
    }
    
    public void removeDuplicatesWithoutRecursion() {
    	if(isListEmpty())
    		throw new RuntimeException("List is empty !!!");
    	Node current = head;
    	while(current != null) {
    		Node first = current;
    		Node second = current.next;
    		
    		while(second != null) {
    			if(current.data == second.data) {
    				first.next = second.next;
    				nodeCount--;
    			} else {
    				first = second;
    			}
    			second = second.next;
    		}
    		current = current.next;
    	}
    }
    
    public void removeDuplicateOfSortedList() {
    	if(isListEmpty())
    		throw new RuntimeException("List is empty !!!");
    	removeDuplicateOfSortedList(head);
    }
    
    public void removeDuplicateOfSortedList(Node trav) {
    	if(trav.next == null)
    		return;
    	if(trav.data == trav.next.data) {
    		trav.next = trav.next.next;
    		nodeCount--;
    		removeDuplicateOfSortedList(trav);
    	}else
    		removeDuplicateOfSortedList(trav.next);
    }
    
    public void reverseForGivenSize(int size) {
    	if(isListEmpty())
    		throw new RuntimeException("List is empty !!!");
    	
    	head = reverseForGivenSize(head, size);
    }
    
    public Node reverseForGivenSize(Node trav, int size) {
    	Node t1 = trav;
    	Node t2 = null;
    	Node t3 = null;
    	int i = 0;
    	
    	while(t1 != null && i < size) {
    		t2 = t1.next;
    		t1.next = t3;
    		t3 = t1;
    		t1 = t2;
    		i++;
    	}
    	if(t2 != null)
    		trav.next = reverseForGivenSize(t2, size);
    	return t3;
    }
}















