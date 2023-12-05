package stackscll;

public class StackBySCLL {
	static class Node{
		private Vehicle vehicle;
		private Node next;
		
		public Node(Vehicle vehicle) {
			this.vehicle = vehicle;
			this.next = null;
		}
	}
	private Node head;
    
    public StackBySCLL() {
    	this.head = null;
    }

    public boolean isStackEmpty() {
    	return (head == null);
    }
    
    public void displayLinkedList() {
		if(isStackEmpty())
			throw new RuntimeException("Stack is empty !!!");
		Node trav = head;
		System.out.println("Stack by Singly Circular Linked List : head");
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
		} else {
			Node trav = head;
			while(trav.next != head)
				trav = trav.next;
			newNode.next = head;
			head = newNode;
			trav.next = head;
		}
	}
	
	public Vehicle pop() {
		Vehicle temp = head.vehicle;
		if(head == head.next)
			head = null;
		else {
			Node trav = head;
			
			while(trav.next != head)
				trav = trav.next;
			head = head.next;
			trav.next = head;
		}
		return temp;
	}
	
	public Vehicle peek() {
		return head.vehicle;
	}
}
