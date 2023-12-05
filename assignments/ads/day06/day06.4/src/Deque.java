
public class Deque {
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
	
	public Deque() {
		this.head = null;
	}
	
	public boolean isDequeEmpty() {
		return (head == null);
	}
	
	public void pushFront(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			newNode.prev = head;
			newNode.next = newNode;
		}
		else {
			newNode.prev = head.prev;
			newNode.next = head;
			head.prev.next = newNode;
			head.prev = newNode;
			head = newNode;
		}
	}
	
	public void pushBack(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			newNode.prev = head;
			newNode.next = newNode;
		}
		else {
			newNode.next = head;
			newNode.prev = head.prev;
			head.prev.next = newNode;
			head.prev = newNode;
		}
	}
	
	public int popFront() {
		if(head == null)
			throw new RuntimeException("Deque is empty !!!");
		int temp = head.data;
		if(head.next == head)
			head = null;
		else {
			head.prev.next = head.next;
			head.next.prev = head.prev;
			head = head.next;
		}
		return temp;
	}
	
	public int popBack() {
		if(head == null)
			throw new RuntimeException("Deque is empty !!!");
		int temp = head.prev.data;
		if(head.next == head)
			head = null;
		else {
			head.prev.prev.next = head;
			head.prev = head.prev.prev;
		}
		return temp;
	}
	
	public int peekFront() {
		if(head == null)
			throw new RuntimeException("Deque is empty !!!");
		return head.data;
	}
	
	public int peekBack() {
		if(head == null)
			throw new RuntimeException("Deque is empty !!!");
		return head.prev.data;
	}
}









