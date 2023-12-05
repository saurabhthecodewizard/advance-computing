package stackslll;

public class StackBySLLL {
	static class Node{
		private Vehicle vehicle;
		private Node next;
		
		public Node(Vehicle vehicle) {
			this.vehicle = vehicle;
			this.next = null;
		}
	}
	private Node head;
    
    public StackBySLLL() {
    	this.head = null;
    }
    
    public void displayStack() {
        if(isStackEmpty())
            throw new RuntimeException("Stack is empty !!!");
        else{
            Node trav = head;
            System.out.print("Stack by Singly linear linked list : head");

            while(trav != null){
                System.out.print(" -> "+trav.vehicle.toString());
                trav = trav.next;
            }

            System.out.println(" -> tail");
        }
        
    }

    public boolean isStackEmpty() {
    	return (head == null);
    }
    
    public void push(Vehicle vehicle) {
		Node newNode = new Node(vehicle);
		if(head == null)
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public Vehicle pop() {
		Vehicle temp = head.vehicle;
		head = head.next;
		return temp;
	}
	
	public Vehicle peek() {
		return head.vehicle;
	}
}
