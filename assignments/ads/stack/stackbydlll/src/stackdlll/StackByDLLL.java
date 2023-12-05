package stackdlll;

public class StackByDLLL {
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
    
    public StackByDLLL() {
    	this.head = null;
    }

    public boolean isStackEmpty() {
    	return (head == null);
    }
    
    public void displayLinkedList() {
		Node trav = head;
		Node temp = null;
		System.out.print("Stack by Doubly Linear Linked List : head");
		while(trav != null) {
			System.out.print(" -> "+trav.vehicle.toString());
			temp = trav;
			trav = trav.next;
		}
	}
    
    public void push(Vehicle vehicle) {
		Node newNode = new Node(vehicle);
		if(head == null) {
			head = newNode;
		} else {
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
	}
	
	public Vehicle pop() {
		Vehicle temp = head.vehicle;
		if(head.next == null)
			head = null;
		else {
			head = head.next;
			head.prev = null;
		}
		return temp;
	}
	
	public Vehicle peek() {
		return head.vehicle;
	}
}
