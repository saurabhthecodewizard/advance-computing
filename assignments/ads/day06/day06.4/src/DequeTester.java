import java.util.Scanner;

public class DequeTester {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Deque deque = new Deque();
		boolean flag = true;
		
		while(flag) {
			try {
				System.out.println("\n*****DEQUE*****");
				System.out.println("0.Exit");
				System.out.println("1.Push front.");
				System.out.println("2.Push back.");
				System.out.println("3.Pop front.");
				System.out.println("4.Pop back.");
				System.out.println("5.Peek front.");
				System.out.println("6.Peek back.");
				System.out.println("\nEnter choice : ");
				
				switch (scan.nextInt()) {
				case 0:
					System.out.println("Exited...");
					flag = false;
					break;
					
				case 1:
					System.out.println("Enter element : ");
					deque.pushFront(scan.nextInt());
					System.out.println("Element added at front.");
					break;
					
				case 2:
					System.out.println("Enter element : ");
					deque.pushBack(scan.nextInt());
					System.out.println("Element added at back.");
					break;
					
				case 3:
					System.out.println("Element deleted from front : "+deque.popFront());
					break;
					
				case 4:
					System.out.println("Element deleted from back : "+deque.popBack());
					break;
					
				case 5:
					System.out.println("Element at front : "+deque.peekFront());
					break;
					
				case 6:
					System.out.println("Element at back : "+deque.peekBack());
					break;

				default:
					System.out.println("Invalid choice !!!");
					break;
				}
				
			}catch(Exception e) {
				System.out.println(e);
			}
		}
		scan.close();
	}
}
