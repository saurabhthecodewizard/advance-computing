package stackdcll;

public class StackByDCLL {
	static class Node{
		private Vehicle vehicle;
		private Node prev;
		private Node next;
		
		public Node(Vehicle vehicle) {
			this.vehicle = vehicle;
			this.prev = null;
			this.next = null;
		}
	}
	private Node head;
    
    public StackByDCLL() {
    	this.head = null;
    }

    public boolean isStackEmpty() {
    	return (head == null);
    }
    
    public void displayLinkedList() {
		if(isStackEmpty())
			throw new RuntimeException("Stack is empty !!!");
		Node trav = head;
		System.out.print("Stack by Doubly Circular Linked List forward : head");
		do {
			System.out.print(" -> "+trav.vehicle.toString());
			trav = trav.next;
		}while(trav != head);
		System.out.println(" -> tail");
	}
    
    public void push(Vehicle vehicle) {
		Node newNode = new Node(vehicle);
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
	}
	
	public Vehicle pop() {
		Vehicle temp = head.vehicle;
		if(head.next == head)
			head = null;
		else {
			head.prev.next = head.next;
			head.next.prev = head.prev;
			head = head.next;
		}
		return temp;
	}
	
	public Vehicle peek() {
		return head.vehicle;
	}
}
