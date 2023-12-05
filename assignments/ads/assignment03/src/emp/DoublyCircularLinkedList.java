package emp;

public class DoublyCircularLinkedList {
	static class Node{
		private Node prev;
		private Employee employee;
		private Node next;
		
		public Node(Employee employee) {
			this.prev = null;
			this.employee = employee;
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
	
	public void displayEmployees() {
		if(isListEmpty())
			throw new RuntimeException("Employee list is empty !!!");
		Node trav = head;
		System.out.println("Employee Linked List forward : head");
		do {
			System.out.println(trav.employee.toString());
			trav = trav.next;
		}while(trav != head);
		System.out.println(" -> tail");
	}
	
	public void displayVehiclesReverse() {
		Node trav = head.prev;
		System.out.println("Employee Linked List reverse : tail");
		do {
			System.out.println(trav.employee.toString());
			trav = trav.prev;
		}while(trav != head.prev);
		System.out.println(" -> head");
	}
	
	public void addVehicleAtFirstPosition(Employee employee) {
		Node newNode = new Node(employee);
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
	
	public void addVehicleAtLastPosition(Employee employee) {
		Node newNode = new Node(employee);
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
	
	public void deleteVehicleAtFirstPosition() {
		if(isListEmpty())
			throw new RuntimeException("Employee list is empty !!!");
		if(head.next == head)
			head = null;
		else {
			head.prev.next = head.next;
			head.next.prev = head.prev;
			head = head.next;
		}
		nodesCount--;
	}
	
	public void deleteVehicleAtLastPosition() {
		if(isListEmpty())
			throw new RuntimeException("Employee list is empty !!!");
		if(head.next == head)
			head = null;
		else {
			head.prev.prev.next = head;
			head.prev = head.prev.prev;
		}
		nodesCount--;
	}
	
}



