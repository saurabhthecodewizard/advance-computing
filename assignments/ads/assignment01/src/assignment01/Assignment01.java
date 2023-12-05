package assignment01;

import java.util.Scanner;

public class Assignment01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		
		while(flag) {
			try {
				System.out.println("\n***Assignment***");
				System.out.println("0.Exit");
				System.out.println("1.Factorial.");
				System.out.println("2.Power.");
				System.out.println("3.GCD");
				System.out.println("4.Find binary.");
				System.out.println("5.Hexadecimal.");
				
				switch (scan.nextInt()) {
				case 0:
					System.out.println("Exited...");
					flag = false;
					break;
					
				case 1:
					System.out.println("Enter number : ");
					System.out.println("Factorial : "+findFactorial(scan.nextInt()));
					break;
					
				case 2:
					System.out.println("Enter base and power : ");
					System.out.println("Power : "+findPower(scan.nextInt(), scan.nextInt()));
					break;
					
				case 3:
					System.out.println("Enter two numbers : ");
					System.out.println("GCD : "+gcd(scan.nextInt(), scan.nextInt()));
					break;
					
				case 4:
					System.out.println("Enter number : ");
					System.out.println("Binary equivalent : "+findBinary(scan.nextInt()));
					break;
					
				case 5:
					System.out.println("Enter number : ");
					System.out.println("Hexadecimal : "+findHexadecimal(scan.nextInt()));
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
	
	public static int findFactorial(int num) {
		if(num > 1)
			return num*findFactorial(num-1);
		else
			return 1;
	}
	
	public static int findPower(int base, int power) {
		if(power == 1)
			return base;
		else
			return base*findPower(base, power-1);
	}
	
	public static int gcd(int n1, int n2) {
		if(n2 != 0 )
			return gcd(n2, n1%n2);
		else
			return n1;
	}
	
	public static int findBinary(int num)
    {
        if (num == 1) {
  
            return 1;
        }
        return findBinary(num / 2) * 10 + num % 2;
    }
	
	public static String findHexadecimal(int num) {
		return Integer.toHexString(num);
	}
}
