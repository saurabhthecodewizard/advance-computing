package threads2;

import static java.lang.Thread.currentThread;
import static java.lang.Thread.sleep;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter bounds : ");
		int start = scan.nextInt();
		int end = scan.nextInt();
		
		if(start%2 == 0);
			
		
		Thread e = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread "+currentThread().getName()+" started");
				try
				{
					for(int i = start ; i <= end ; i++)
					{
						if(i%2 == 0)
						{
							System.out.println(currentThread().getName()+" value "+i);
							sleep(1200);
						}
					}
				}
				catch(Exception e)
				{
					System.out.println("Error occured in "+currentThread().getName());
				}
				System.out.println("Thread "+currentThread().getName()+" over...");
				
			}
			
		}
				, "even");
		Thread o =new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Thread "+currentThread().getName()+" started");
				try
				{
					for(int i = start ; i <= end ; i++)
					{
						if(i%2 != 0)
						{
							System.out.println(currentThread().getName()+" value "+i);
							sleep(1200);
						}
					}
				}
				catch(Exception e)
				{
					System.out.println("Error occured in "+currentThread().getName());
				}
				System.out.println("Thread "+currentThread().getName()+" over...");
				
			}
			
		}
				, "odd");
		
		e.start();
		o.start();
		
		for(int i = start; i <= end ; i++) {
			System.out.println(Thread.currentThread().getName()+" main value "+i);
			Thread.sleep(500);
		}
		
		e.join();
		o.join();
		
		System.out.println("main over...");
		scan.close();
	}

}
