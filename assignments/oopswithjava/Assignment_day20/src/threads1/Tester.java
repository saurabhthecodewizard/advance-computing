package threads1;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter bounds : ");
		int start = scan.nextInt();
		int end = scan.nextInt();
		
		EvenPrinterTask e = new EvenPrinterTask("even",start,end);
		OddPrinterTask o = new OddPrinterTask("odd",start,end);
		
		e.start();
		o.start();
		
		for(int i = start; i <= end ; i++) {
			System.out.println(Thread.currentThread().getName()+" main value "+i);
			Thread.sleep(500);
		}

		o.join();
		e.join();
		
		System.out.println("main over...");
		scan.close();
	}

}
