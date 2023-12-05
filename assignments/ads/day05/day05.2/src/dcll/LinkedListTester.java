package dcll;

import java.util.Scanner;

public class LinkedListTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DoublyCircularLinkedList dcll = populateLinkedList();
		boolean flag = true;
		
		do {
			try {
				
				switch (menu()) {
				case 0:
					System.out.println("Exited...");
					flag = false;
					break;
					
				case 1:
					System.out.println("Enter element : ");
					dcll.addNodeAtFirstPosition(scan.nextInt());
					System.out.println("Element added at first position.");
					break;
					
				case 2:
					System.out.println("Enter element : ");
					dcll.addNodeAtLastPosition(scan.nextInt());
					System.out.println("Element added at last position.");
					break;
					
				case 3:
					System.out.println("Enter position and element : ");
					dcll.addNodeAtSpecificPosition(scan.nextInt(), scan.nextInt());
					System.out.println("Element added at given position.");
					break;
					
				case 4:
					dcll.deleteNodeAtFirstPosition();
					System.out.println("Element deleted at first position.");
					break;
					
				case 5:
					dcll.deleteNodeAtLastPosition();
					System.out.println("Element deleted at last position.");
					break;
					
				case 6:
					System.out.println("Enter position : ");
					dcll.deleteNodeAtSpecificPosition(scan.nextInt());
					System.out.println("Element deleted at given position.");
					break;
					
				case 7:
					dcll.displayLinkedList();
					break;
					
				case 8:
					dcll.displayLinkedListReverse();
					break;
					
				case 9:
					System.out.println("Number of nodes : "+dcll.getNodesCount());
					break;
					
				case 10:
					System.out.println("Enter element : ");
					if(dcll.searchAndDelete(scan.nextInt()))
						System.out.println("Element deleted.");
					else
						System.out.println("Element not found in linked list !");
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
		Scanner scan =  new Scanner(System.in);
		System.out.println("\n0.Exit "
				+ "\n1.Add element at first position "
				+ "\n2.Add element at last position "
				+ "\n3.Add element at specific position "
				+ "\n4.Delete element at first position "
				+ "\n5.Delete element at last position "
				+ "\n6.Delete element at specific position "
				+ "\n7.Display linked list "
				+ "\n8.Display linked list reverse "
				+ "\n9.Display number of nodes "
				+ "\n10.Search element and delete ");
		System.out.println("\nEnter choice : ");
		return scan.nextInt();
	}
	
	public static DoublyCircularLinkedList populateLinkedList() {
		DoublyCircularLinkedList dcll = new DoublyCircularLinkedList();
		
		dcll.addNodeAtFirstPosition(40);
		dcll.addNodeAtFirstPosition(30);
		dcll.addNodeAtFirstPosition(20);
		dcll.addNodeAtFirstPosition(10);
		dcll.addNodeAtLastPosition(50);
		dcll.addNodeAtLastPosition(60);
		dcll.addNodeAtLastPosition(70);
		dcll.addNodeAtLastPosition(80);
		
		return dcll;
	}
}
