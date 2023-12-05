package stackdcll;

import java.util.Scanner;

public class StackTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StackByDCLL stack = new StackByDCLL();
		boolean flag = true;
		
		do {
			try {
				System.out.println("\n***Stack by DCLL***");
				System.out.println("0.Exit "
						+ "\n1.Push"
						+ "\n2.Pop"
						+ "\n3.Peek");
				System.out.println("\nEnter choice : ");
				switch (scan.nextInt()) {
				case 0:
					System.out.println("Exited...");
					flag = false;
					break;
					
				case 1:
					System.out.println("Enter vehicle details : No, Company, Model, Type, Price, Color");
					stack.push(new Vehicle(scan.nextInt(), scan.next(), scan.next(), scan.next(), scan.nextDouble(), scan.next()));
					System.out.println("Vehicle added.");
					break;
					
				case 2:
					if(stack.isStackEmpty())
						throw new RuntimeException("Stack is empty !!!");
					System.out.println("Vehicle deleted : "+stack.pop());
					break;
					
				case 3:
					if(stack.isStackEmpty())
						throw new RuntimeException("Stack is empty !!!");
					System.out.println("Vehicle element : "+stack.peek());
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
