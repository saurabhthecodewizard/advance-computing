package stack;

import java.util.Scanner;

public class StackTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StaticStack stack = new StaticStack();
		boolean flag = true;
		
		do {
			try {
				System.out.println("\n***Stack***");
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
					if(stack.isStackFull())
						throw new RuntimeException("Stack is full !!!");
					System.out.println("Enter element : ");
					stack.push(scan.nextInt());
					System.out.println("Element added.");
					break;
					
				case 2:
					if(stack.isStackEmpty())
						throw new RuntimeException("Stack is empty !!!");
					stack.pop();
					System.out.println("Element deleted.");
					break;
					
				case 3:
					if(stack.isStackEmpty())
						throw new RuntimeException("Stack is empty !!!");
					System.out.println("Fetched element : "+stack.peek());
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
