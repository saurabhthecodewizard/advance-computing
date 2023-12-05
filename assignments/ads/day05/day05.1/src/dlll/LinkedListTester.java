package dlll;

import java.util.Scanner;

public class LinkedListTester {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		DoublyLinearLinkedList dlll = populateLinkedList();
		
		boolean flag = true;
		
		do {
			try {
				switch (menu()) {
				case 0:
					System.out.println("Exited...");
					flag = false;
					break;
					
				case 1:
					System.out.println("Enter data : ");
					dlll.addNodeAtFirstPosition(scan.nextInt());
					System.out.println("Element added at first position.");
					break;
					
				case 2:
					System.out.println("Enter data : ");
					dlll.addNodeAtLastPosition(scan.nextInt());
					System.out.println("Element added at last position.");
					break;
					
				case 3:
					System.out.println("Enter position and data : ");
					dlll.addNodeAtSpecificPosition(scan.nextInt(), scan.nextInt());
					System.out.println("Element added at given position.");
					break;
					
				case 4:
					dlll.deleteNodeAtFirstPosition();
					System.out.println("Element deleted at first position.");
					break;
					
				case 5:
					dlll.deleteNodeAtLastPosition();
					System.out.println("Element deleted at last position.");
					break;
					
				case 6:
					System.out.println("Enter position to be deleted : ");
					dlll.deleteNodeAtSpecificPosition(scan.nextInt());
					System.out.println("Element deleted at given position.");
					break;
					
				case 7:
					System.out.println("Number of nodes : "+dlll.getNodesCount());
					break;
					
				case 8:
					dlll.displayLinkedList();
					break;
					
				case 9:
					dlll.displayLinkedListReverse();
					break;
					
				case 10:
					System.out.println("Enter element : ");
					dlll.searchAndDelete(scan.nextInt());
					System.out.println("Element deleted.");
					break;

				default:
					System.out.println("Invalid choice !!!");
					break;
				}
				
			}catch(Exception e){
				System.out.println(e);
			}
			
		}while(flag);
		scan.close();
	}
	
	public static int menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\n0.Exit "
				+ "\n1.Add node at first position "
				+ "\n2.Add node at last position "
				+ "\n3.Add node at specific position "
				+ "\n4.Delete node at first position "
				+ "\n5.Delete node at last position "
				+ "\n6.Delete node at specific position "
				+ "\n7.Display number of elements "
				+ "\n8.Display Linked List "
				+ "\n9.Display reverse Linked List "
				+ "\n10.Search element and delete ");
		System.out.println("\nEnter choice : ");
		return scan.nextInt();
	}
	
	public static DoublyLinearLinkedList populateLinkedList() {
		DoublyLinearLinkedList dlll = new DoublyLinearLinkedList();
		
		dlll.addNodeAtLastPosition(10);
		dlll.addNodeAtLastPosition(20);
		dlll.addNodeAtLastPosition(30);
		dlll.addNodeAtLastPosition(40);
		dlll.addNodeAtLastPosition(50);
		dlll.addNodeAtLastPosition(60);
		dlll.addNodeAtLastPosition(70);
		dlll.addNodeAtLastPosition(80);
		
		return dlll;
	}

}
