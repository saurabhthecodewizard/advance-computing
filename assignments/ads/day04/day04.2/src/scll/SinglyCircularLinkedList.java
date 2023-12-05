package scll;

public class SinglyCircularLinkedList {
	static class Node{
		 private int data;
		 private Node next;
		 
		 public Node(int data) {
			 this.data = data;
			 this.next = null;
		 }
	}
	
	private Node head;
	private int nodesCount;
	
	public SinglyCircularLinkedList() {
		this.head = null;
		this.nodesCount = 0;
	}
	
	public int getNodesCount() {
		return this.nodesCount;
	}
	
	public Node getHead() {
		return this.head;
	}
	
	public boolean isListEmpty() {
		return (head == null);
	}
	
	public void displayLinkedList() {
		if(isListEmpty())
			throw new RuntimeException("List is empty !!!");
		Node trav = head;
		System.out.println("Singly Circular Linked List : head");
		do {
			System.out.print(" -> "+trav.data);
			trav = trav.next;
		}while(trav != head);
		System.out.println(" -> tail");
	}
	
	public void addNodeAtFirstPosition(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			newNode.next = head;
		}else {
			Node trav = head;
			
			while(trav.next != head)
				trav = trav.next;
			newNode.next = head;
			head = newNode;
			trav.next = head;
		}
		nodesCount++;
	}
	
	public void addNodeAtLastPosition(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			newNode.next = head;
		}else {
			Node trav = head;
			
			while(trav.next != head)
				trav = trav.next;
			trav.next = newNode;
			newNode.next = head;
		}
		nodesCount++;
	}
	
	public void addNodeAtSpecificPosition(int data, int pos) {
		if(pos < 1 || pos > nodesCount)
			throw new RuntimeException("Invalid position !!!");
		if(pos == 1)
			addNodeAtFirstPosition(data);
		else if(pos == nodesCount+1)
			addNodeAtLastPosition(data);
		else {
			Node newNode = new Node(data);
			Node trav = head;
			int i = 1;
			
			while(i < (pos - 1)) {
				i++;
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
			nodesCount++;
		}
	}
	
	public void deleteNodeAtFirstPosition() {
		if(isListEmpty())
			throw new RuntimeException("List is empty !!!");
		
		if(head == head.next)
			head = null;
		else {
			Node trav = head;
			
			while(trav.next != head)
				trav = trav.next;
			head = head.next;
			trav.next = head;
		}
		nodesCount--;
	}
	
	public void deleteNodeAtLastPosition() {
		if(isListEmpty())
			throw new RuntimeException("List is empty !!!");
		
		if(head == head.next)
			head = null;
		else {
			Node trav = head;
			
			while(trav.next.next != head)
				trav = trav.next;
			trav.next = head;
		}
		nodesCount--;
	}
	
	public void deleteNodeAtSpecificPosition(int pos) {
		if(isListEmpty())
			throw new RuntimeException("List is empty !!!");
		if(pos < 1 || pos > nodesCount)
			throw new RuntimeException("Invalid position !!!");
		if(pos == 1)
			deleteNodeAtFirstPosition();
		else if(pos == nodesCount)
			deleteNodeAtLastPosition();
		else {
			Node trav = head;
			int i = 1;
			
			while(i < pos-1) {
				i++;
				trav = trav.next;
			}
			trav.next = trav.next.next;
			nodesCount--;
		}
	}
	
	public void displayListInReverseOrder() {
		System.out.print("Linked list reverse : tail");
		displayListInReverseOrder(head.next);
		System.out.println(" -> "+head.data+" -> head");
	}
	
	public void displayListInReverseOrder(Node trav) {
		if(trav == head)
			return;
		displayListInReverseOrder(trav.next);
		System.out.print(" -> "+trav.data);
	}
	
	public void reverseList() {
		Node t1 = null;
		Node t2 = head;
		
		do{
			Node t3 = t2.next;
			t2.next = t1;
			t1 = t2;
			t2 = t3;
		}while(t2 != head);
		
		head.next = t1;
		head = t1;
	}
	
	public boolean searchAndDelete(int data) {
		
		Node[] temp = {null, null};
		
		if(!searchNode(data, temp))
			return false;
		
		if(temp[0] == null) {
			System.out.println("Element ("+temp[1].data+") found at first position");
			deleteNodeAtFirstPosition();
		}else {
			System.out.println("Prevoius element : "+temp[0].data);
			System.out.println("Current element : "+temp[1].data);
			temp[0].next = temp[1].next;
			nodesCount--;
		}
		
		return true;
	}
	
	public boolean searchNode(int data, Node[] temp) {
		temp[0] = null;
		System.out.println(head.data+data);
		if(head.data == data) {
			temp[1] = head;
			return true;
		}
		for(Node trav = head.next ; trav != head ; trav = trav.next) {
			if(trav.data == data) {
				temp[1] = trav;
				return true;
			}
			temp[0] = trav;
		}
		return false;
	}

}




