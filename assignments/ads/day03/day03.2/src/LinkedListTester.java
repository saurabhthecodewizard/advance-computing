import java.util.Scanner;

public class LinkedListTester {

	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        SinglyLinearLinkedList slll = new SinglyLinearLinkedList();

	        boolean flag = true;
	        do{
	            try{
	                System.out.println("\n0.Exit \n1.Display no of nodes \n2.Display linked list \n3.Add node at last position \n4.Add node at first position \n5.Add node at specific position");
	                System.out.println("Enter choice : ");
	                switch (scan.nextInt()) {
	                    case 0:
	                        System.out.println("Exited...");
	                        flag = false;
	                        break;

	                    case 1:
	                        System.out.println("No of nodes in the list are : "+slll.getNodesCount());
	                        break;

	                    case 2:
	                        slll.displayLinkedList();
	                        break;

	                    case 3:
	                        System.out.println("Enter number to be added : ");
	                        slll.addNodeAtLastPosition(scan.nextInt());
	                        System.out.println("Element added at last position.");
	                        break;

	                    case 4:
	                        System.out.println("Enter number to be added : ");
	                        slll.addNodeAtFirstPosition(scan.nextInt());
	                        System.out.println("Element added at first position.");
	                        break;

	                    case 5:
	                        System.out.println("Enter position and number to be added : ");
	                        slll.addNodeAtSpecificPosition(scan.nextInt(), scan.nextInt());
	                        System.out.println("Element added at specific position.");
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
}
