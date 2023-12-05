package scll;

import java.util.Scanner;

public class LinkedListTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		SinglyCircularLinkedList scll = populateLinkedList();
		
		boolean flag = true;
		
		do {
			try {
				
				switch (menu()) {
				case 0:
					System.out.println("Exited...");
					flag = false;
					break;
					
				case 1:
					System.out.println("Enter number to be added : ");
					scll.addNodeAtFirstPosition(scan.nextInt());
					System.out.println("Element added at first position");
					break;
					
				case 2:
					System.out.println("Enter number to be added : ");
					scll.addNodeAtLastPosition(scan.nextInt());
					System.out.println("Element added at last position");
					break;
					
				case 3:
					System.out.println("Enter element and position to be added : ");
					scll.addNodeAtSpecificPosition(scan.nextInt(), scan.nextInt());
					System.out.println("Element added at given position.");
					break;
					
				case 4:
					scll.deleteNodeAtFirstPosition();
					System.out.println("Element deleted at first position.");
					break;
					
				case 5:
					scll.deleteNodeAtLastPosition();
					System.out.println("Element deleted at last position.");
					break;
					
				case 6:
					System.out.println("Enter position : ");
					scll.deleteNodeAtSpecificPosition(scan.nextInt());
					System.out.println("Element deleted at given position.");
					break;
					
				case 7:
					scll.displayLinkedList();
					break;
					
				case 8:
					System.out.println("Number of nodes in linked list : "+scll.getNodesCount());
					break;
					
				case 9:
					scll.displayListInReverseOrder();
					break;
					
				case 10:
					scll.reverseList();
					System.out.println("Linked list is reversed.");
					break;
					
				case 11:
					System.out.println("Enter element to be deleted : ");
					if(scll.searchAndDelete(scan.nextInt()))
						System.out.println("Element deleted successfully.");
					else
						System.out.println("Element not found in list.");
					break;

				default:
					System.out.println("Invalid choice !!!");
					break;
				}
				
				
			}catch(Exception e) {
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
				+ "\n7.Display linked list "
				+ "\n8.Display number of nodes "
				+ "\n9.Display list in reverse order "
				+ "\n10.Reverse the linked list "
				+ "\n11.Search by element and delete ");
		System.out.println("\nEnter choice : ");
		
		return scan.nextInt();
	}
	
	public static SinglyCircularLinkedList populateLinkedList() {
		SinglyCircularLinkedList scll = new SinglyCircularLinkedList();
		
		scll.addNodeAtLastPosition(10);
		scll.addNodeAtLastPosition(20);
		scll.addNodeAtLastPosition(30);
		scll.addNodeAtLastPosition(40);
		scll.addNodeAtLastPosition(50);
		scll.addNodeAtLastPosition(60);
		scll.addNodeAtLastPosition(70);
		scll.addNodeAtLastPosition(80);
		
		return scll;
	}
}
