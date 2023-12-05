package assignment02;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while(flag) {
			try{
				
				System.out.println("\n***Assignment 2***");
				System.out.println("0.Exit.");
				System.out.println("1.First non repeating element.");
				System.out.println("2.First three non repeating element.");
				System.out.println("3.Insert element in array in sorted manner.");
				System.out.println("4.Find rank.");
				System.out.println("5.Remove characters.");
				System.out.println("6.Print substring : ");
				System.out.println("7.Encrypt and decrypt string");
				System.out.println("8.Rewrite string alphabetically");
				System.out.println("9.Replace substring.");
				System.out.println("10.Magic Square or not.");
				
				System.out.println("\nEnter choice : ");
				switch (scan.nextInt()) {
				case 0:
					System.out.println("Exited...");
					flag = false;
					break;

				case 1:
					int[] arr = new int[] { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
					int arr1 = firstNonRepeatingElement(arr);
					if(arr1 == Integer.MIN_VALUE)
						System.out.print("All elements are repeated atleast once.");
					else
						System.out.println("First non repeating element : "+arr1);
					break;
					
				case 2:
					int[] arr2 = new int[] { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
					for(int i : firstThreeNonRepeatingElement(arr2))
						System.out.println(i+" ");
					break;
					
				case 3:
					int[] arr3 = new int[10];
					for(int i3=0 ; i3 < 7 ;i3++) {
						int temp3 = i3*5;
						arr3[i3] = temp3;
					}
					System.out.println("Enter element to be inserted : ");
					insertElementInSortedManner(arr3,7, scan.nextInt());
					for(int i : arr3)
						System.out.print(i+" ");
					break;
					
				case 4:
					int[] arr4 = new int[] { 10, 20, 15, 3, 4, 4, 1 };
					System.out.println("Enter number : ");
					System.out.println("Rank : "+findRank(arr4, scan.nextInt()));
					break;
					
				case 5:
					System.out.println("Enter string : ");
					String s5 = scan.next();
					System.out.println("Enter character : ");
					char c5 = (scan.next()).charAt(0);
					System.out.println("Modified string : "+removeCharacters(new StringBuilder(s5), c5));
					break;
					
				case 6:
					System.out.println("Enter string : ");
					String s6 = scan.next();
					System.out.println("Enter begin index : ");
					int b61 = scan.nextInt();
					System.out.println("Enter number of characters : ");
					int b62 = scan.nextInt() + b61;
					System.out.println("Substring : "+s6.substring(b61, b62));
					break;
					
				case 7:
					System.out.println("Enter string : ");
					String s7 = scan.next();
					String s71 = encryptString(s7);
					System.out.println("Encrypted string : "+s71);
					System.out.println("Decrypted string : "+decryptString(s71));
					break;
					
				case 8:
					System.out.println("Enter string : ");
					System.out.println("Alphabetical order : "+rewriteStringAlphabetically(scan.next()));
					break;
					
				case 9://"He is from dubai and from UAE"
					System.out.println("Enter string : ");
					scan.nextLine();
					String s9 = scan.nextLine();
					System.out.println("Old string : "+s9);
					System.out.println("Modified string : "+s9.replaceAll("from", "to"));
					break;
					
				case 10:
					int[][] squareArray1 = { {8,1,6}, {3,5,7}, {4,9,2} };
					int[][] squareArray2 = { {11,24,7,20,3}, {4,12,25,8,16}, {17,5,13,21,9}, {10,18,1,14,22}, {23,6,19,2,15} };
					int[][] squareArray3 = {{ 4, 3, 2 }, { 6, 7, 3 }, { 1, 9, 5 }};
					System.out.println("squareArray1 is a "+isMagicSquare(squareArray1)+" magic square");
					System.out.println("squareArray2 is a "+isMagicSquare(squareArray2)+" magic square");
					System.out.println("squareArray3 is a "+isMagicSquare(squareArray3)+" magic square");
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
	
	public static int firstNonRepeatingElement(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			int j;
			for(j = 0 ; j < arr.length ; j++) {
				if( i!=j && arr[i] == arr[j])
					break;
			}
			if(j == arr.length)
				return arr[i];
		}
		return Integer.MIN_VALUE;
	}
	
	public static int[] firstThreeNonRepeatingElement(int[] arr) {
		int[] result = new int[3];
		int k = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			int j;
			for(j = 0 ; j < arr.length ; j++) {
				if( i!=j && arr[i] == arr[j])
					break;
			}
			if(j == arr.length)
				result[k++] = arr[i];
			if(k == 3)
				break;
		}
		return result;
	}
	
	public static int[] insertElementInSortedManner(int[] arr,int n, int num) {
		int i = n-1;
		while(num<arr[i] && i>=0)
	     {
	           arr[i+1] = arr[i];
	           i--;
	     }
	     arr[i+1] = num;
	     return arr;
	}
	
	public static int findRank(int[] arr, int num) {
		int res = 0;
		for(int i = 0 ; i < arr.length ; i++)
			if(arr[i] <= num)
				res++;
		return res;
	}
	
	public static String removeCharacters(StringBuilder sb, char c) {
		for(int i = 0 ; i < sb.length() ; i++) {
			if(sb.charAt(i) == c) {
				sb.deleteCharAt(i);
			}
		}
		return sb.toString();
	}
	
	public static String encryptString(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < s.length() ; i++) 
			sb.append(Character.valueOf((char) (s.charAt(i) + '0')));
		return sb.toString();
	}
	
	public static String decryptString(String s) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < s.length() ; i++) 
			sb.append(Character.valueOf((char) (s.charAt(i) - '0')));
		return sb.toString();
	}
	
	public static String rewriteStringAlphabetically(String s) {
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		return new String(arr);
	}
	
	public static boolean isMagicSquare(int[][] arr) {
		int diagonalSum1=0,diagonalSum2=0;
		for(int i=0 ; i < arr.length ; i++) {
			diagonalSum1 += arr[i][i]; 
			diagonalSum2 += arr[i][arr.length - i - 1];
		}
		if( diagonalSum1 != diagonalSum2)
			return false;
		for(int i=0 ; i< arr.length ; i++) {
			int rowSum=0,columnSum=0;
			for(int j=0; j < arr.length ; j++) {
				rowSum += arr[i][j];
				columnSum += arr[j][i];
			}
			if(rowSum != columnSum || rowSum != diagonalSum1)
				return false;
		}
		return true;
	}
}
