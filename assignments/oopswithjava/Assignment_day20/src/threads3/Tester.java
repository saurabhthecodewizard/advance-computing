package threads3;

import java.util.stream.IntStream;
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
			
		
		Thread e = new Thread(() -> IntStream.rangeClosed(start, end)
											.filter(i -> i%2 == 0)
											.forEach(i -> {System.out.println(currentThread().getName()+" even value "+i);
															try {
																sleep(1000);
															} catch (InterruptedException e1) {
																System.out.println(e1);
															}})
											
											, "even");
		Thread o =new Thread(() -> IntStream.rangeClosed(start, end)
											.filter(i -> i%2 != 0)
											.forEach(i -> {System.out.println(currentThread().getName()+" even value "+i);
											try {
												sleep(1000);
											} catch (InterruptedException e1) {
												System.out.println(e1);
											}})
							
											, "odd");
		
		e.start();
		o.start();
		
		for(int i = start; i <= end ; i++) {
			System.out.println(Thread.currentThread().getName()+" main value "+i);
			sleep(500);
		}
		
		e.join();
		o.join();
		
		System.out.println("main over...");
		scan.close();
	}

}
