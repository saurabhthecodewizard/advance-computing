package dlll;

public class DoublyLinearLinkedList {
	static class Node{
		private Node prev;
		private int data;
		private Node next;
		
		public Node(int data) {
			this.prev = null;
			this.data = data;
			this.next = null;
		}
	}
	
	private Node head;
	private int nodesCount;
	
	public DoublyLinearLinkedList() {
		this.head = null;
		this.nodesCount = 0;
	}
	
	public int getNodesCount() {
		return (this.nodesCount);
	}
	
	public boolean isListEmpty() {
		return (head == null);
	}
	
	public void displayLinkedList() {
		if(isListEmpty())
			throw new RuntimeException("List is empty !!!");
		
		System.out.println("Number of nodes : "+nodesCount);
		
		Node trav = head;
		Node temp = null;
		System.out.print("Doubly Circular Linked List in forward order : head");
		while(trav != null) {
			System.out.print(" -> "+trav.data);
			temp = trav;
			trav = trav.next;
		}
		System.out.println(" -> tail");
		System.out.print("Doubly Circular Linked List in reverse order : tail");
		while(temp != null) {
			System.out.print(" -> "+temp.data);
			temp = temp.prev;
			
		}
		System.out.println(" -> head");
	}
	
	public void displayLinkedListReverse() {
		if(isListEmpty())
			throw new RuntimeException("List is empty !!!");
		System.out.print("tail -> ");
		displayLinkedListReverse(head);
		System.out.println(" -> head");
	}
	
	public void displayLinkedListReverse(Node trav) {
		if(trav == null)
			return;
		
		displayLinkedListReverse(trav.next);
		System.out.print(" -> "+trav.data);
	}
	
	public void addNodeAtFirstPosition(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		} else {
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
		nodesCount++;
	}
	
	public void addNodeAtLastPosition(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		} else {
			Node trav = head;
			
			while(trav.next != null)
				trav = trav.next;
			
			newNode.prev = trav;
			trav.next = newNode;
		}
		nodesCount++;
	}
	
	public void addNodeAtSpecificPosition(int pos, int data) {
		if(pos < 1 || pos > (nodesCount+1))
			throw new RuntimeException("Invalid position !!!");
		if(pos == 1)
			addNodeAtFirstPosition(data);
		else if(pos == (nodesCount + 1))
			addNodeAtLastPosition(data);
		else {
			Node newNode = new Node(data);
			Node trav = head;
			int i = 1;
			while(i < pos-1) {
				i++;
				trav = trav.next;
			}
			newNode.prev = trav;
			newNode.next = trav.next;
			trav.next.prev = newNode;
			trav.next = newNode;
			nodesCount++;
		}
	}
	
	public void deleteNodeAtFirstPosition() {
		if(isListEmpty())
			throw new RuntimeException("List is empty !!!");
		if(head.next == null)
			head = null;
		else {
			head = head.next;
			head.prev = null;
		}
		nodesCount--;
	}
	
	public void deleteNodeAtLastPosition() {
		if(isListEmpty())
			throw new RuntimeException("List is empty !!!");
		if(head.next == null)
			head = null;
		else {
			Node trav = head;
			while(trav.next.next != null)
				trav = trav.next;
			trav.next = null;
		}
		nodesCount--;
	}
	
	public void deleteNodeAtSpecificPosition(int pos) {
		if(isListEmpty())
			throw new RuntimeException("List is empty !!!");
		if(pos < 1 || pos > (nodesCount))
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
			trav.next.next.prev = trav;
			trav.next = trav.next.next;
			nodesCount--;
		}
	}
	
	public boolean searchAndDelete(int data) {
		if(isListEmpty())
			throw new RuntimeException("List is empty !!!");
		Node[] temp = {null, null};
		if(!searchNode(data, temp))
			return false;
		
		if(temp[0] == null)
			deleteNodeAtFirstPosition();
		else {
			temp[0].next = temp[1].next;
			temp[1].next.prev = temp[0];
		}
		nodesCount--;
		return true;
	}
	
	public boolean searchNode(int data, Node[] temp) {
		temp[0] = null;
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
