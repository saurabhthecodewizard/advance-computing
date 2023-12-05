
public class StackByLinkedList {
	static class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private Node head;
	
	public StackByLinkedList() {
		this.head = null;
	}
	
	public boolean isStackEmpty() {
		return (head == null);
	}
	
	public void push(int data) {
		Node newNode = new Node(data);
		if(head == null)
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public int pop() {
		if(head == null)
			throw new RuntimeException("Stack is empty !!!");
		int temp = head.data;
		head = head.next;
		return temp;
	}
	
	public int peek() {
		if(head == null)
			throw new RuntimeException("Stack is empty !!!");
		return head.data;
	}
}
