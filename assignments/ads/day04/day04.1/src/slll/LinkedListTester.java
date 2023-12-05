package slll;
import java.util.Scanner;

public class LinkedListTester {

	 public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SinglyLinearLinkedList slll = populateLinkedList();

        boolean flag = true;
        do{
            try{
                
                switch (menu()) {
                    case 0:
                        System.out.println("Exited...");
                        flag = false;
                        break;

                    case 1:
                        System.out.println("Enter number to be added : ");
                        slll.addNodeAtFirstPosition(scan.nextInt());
                        System.out.println("Element added at first position.");
                        break;

                    case 2:
                        System.out.println("Enter number to be added : ");
                        slll.addNodeAtLastPosition(scan.nextInt());
                        System.out.println("Element added at last position.");
                        break;

                    case 3:
                        System.out.println("Enter position and number to be added : ");
                        slll.addNodeAtSpecificPosition(scan.nextInt(), scan.nextInt());
                        System.out.println("Element added at specific position.");
                        break;
                        
                    case 4:
                    	slll.deleteNodeAtFirstPosition();
                    	System.out.println("Element deleted at first position");
                    	break;
                    	
                    case 5:
                    	slll.deleteNodeAtLastPosition();
                    	System.out.println("Element deleted at last position");
                    	break;
                    	
                    case 6:
                    	System.out.println("Enter position to be deleted : ");
                    	slll.deleteNodeAtSpecificPosition(scan.nextInt());
                    	System.out.println("Element deleted at given position");
                    	break;
                        
                    case 7:
                        System.out.println("No of nodes in the list are : "+slll.getNodesCount());
                        break;

                    case 8:
                        slll.displayLinkedList();
                        break;
                        
                    case 9:
                    	System.out.print("Linked list in reverse order : head");
                    	slll.displayLinkedListReverse();
                    	break;
                    	
                    case 10:
                    	slll.reverseLinkedList();
                    	System.out.println("Linked list reversed.");
                    	break;
                    	
                    case 11:
                    	System.out.println("Enter data to be searched and delete : ");
                    	if(slll.searchNodeAndDelete(scan.nextInt()))
                    		System.out.println("Element found and deleted");
                    	else
                    		System.out.println("Element not found.");
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
		 		+ "\n7.Display no of nodes "
		 		+ "\n8.Display linked list "
		 		+ "\n9.Display linked list in reverse order "
		 		+ "\n10.Reverse given linked list "
		 		+ "\n11.Search by data and delete ");
         System.out.println("\nEnter choice : ");
         return scan.nextInt();
	 }
	 
	 public static SinglyLinearLinkedList populateLinkedList() {
		 SinglyLinearLinkedList slll = new SinglyLinearLinkedList();
		 
		 slll.addNodeAtLastPosition(10);
		 slll.addNodeAtLastPosition(20);
		 slll.addNodeAtLastPosition(30);
		 slll.addNodeAtLastPosition(40);
		 slll.addNodeAtLastPosition(50);
		 slll.addNodeAtLastPosition(60);
		 slll.addNodeAtLastPosition(70);
		 slll.addNodeAtLastPosition(80);
		 
		 return slll;
	 }
	 
}
