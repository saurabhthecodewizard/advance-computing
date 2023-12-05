package dcll;

import javax.management.RuntimeErrorException;

public class DoublyCircularLinkedList {
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
	
	public DoublyCircularLinkedList() {
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
		Node trav = head;
		System.out.print("Doubly Circular Linked List forward : head");
		do {
			System.out.print(" -> "+trav.data);
			trav = trav.next;
		}while(trav != head);
		System.out.println(" -> tail");
	}
	
	public void displayLinkedListReverse() {
		Node trav = head.prev;
		System.out.print("Doubly Circular Linked List reverse : tail");
		do {
			System.out.print(" -> "+trav.data);
			trav = trav.prev;
		}while(trav != head.prev);
		System.out.println(" -> head");
	}
	
	public void addNodeAtFirstPosition(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			newNode.next = head;
			newNode.prev = newNode;
		}else {
			newNode.next = head;
			newNode.prev = head.prev;
			head.prev.next = newNode;
			head.prev = newNode;
			head = newNode;
		}
		nodesCount++;
	}
	
	public void addNodeAtLastPosition(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			newNode.next = head;
			newNode.prev = newNode;
		}else {
			newNode.prev = head.prev;
			newNode.next = head;
			head.prev.next = newNode;
			head.prev = newNode;
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
			
			while(i < (pos-1)) {
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
		if(head.next == head)
			head = null;
		else {
			head.prev.next = head.next;
			head.next.prev = head.prev;
			head = head.next;
		}
		nodesCount--;
	}
	
	public void deleteNodeAtLastPosition() {
		if(isListEmpty())
			throw new RuntimeException("List is empty !!!");
		if(head.next == head)
			head = null;
		else {
			head.prev.prev.next = head;
			head.prev = head.prev.prev;
		}
		nodesCount--;
	}
	
	public void deleteNodeAtSpecificPosition(int pos) {
		if(isListEmpty())
			throw new RuntimeException("List is empty !!!");
		if(pos < 1 || pos > (nodesCount + 1))
			throw new RuntimeException("Invalid position !!!");
		if(pos == 1)
			deleteNodeAtFirstPosition();
		else if(pos == (nodesCount + 1))
			deleteNodeAtLastPosition();
		else {
			Node trav = head;
			int i = 1;
			
			while(i < (pos - 1)) {
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
		
		if(temp[0] == null) {
			System.out.println("Element ("+temp[1].data+") found.");
			deleteNodeAtFirstPosition();
		}else {
			System.out.println("Element ("+temp[1].data+") found after ("+temp[0].data+").");
			temp[1].next.prev = temp[0];
			temp[0].next = temp[1].next;
			nodesCount--;
		}
		return true;
	}
	
	public boolean searchNode(int data, Node[] temp) {
		temp[0] = null;
		if(data == head.data) {
			temp[1] = head;
			return true;
		}
		for(Node trav = head.next ; trav != head ; trav = trav.next) {
			if(data == trav.data) {
				temp[1] = trav;
				return true;
			}
			temp[0] = trav;
		}
		return false;
	}
}



