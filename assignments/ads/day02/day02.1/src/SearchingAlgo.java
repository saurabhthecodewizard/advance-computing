import java.util.Scanner;

public class SearchingAlgo {

    static int comparisons;

    public static void main(String[] args) {
        
        int[] arr = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        Scanner scan = new Scanner(System.in);

        boolean flag = true;

        do {
            System.out.println("\n0.Exit \n1.Display array Elements \n2.Find element linearly without recursion \n3.Find element linearly with recursion");
            System.out.println("4.Find element with binary without recursion\n5.Find element with binary with recursion");
            System.out.println("\nEnter choice : ");
            switch (scan.nextInt()) {
                case 0:
                    System.out.println("Exited...");
                    flag = false;
                    break;

                case 1:
                    displayArrayElements(arr);
                    break;

                case 2:
                    System.out.println("Enter element to find");
                    if(findElementLinearWithoutRecursion(arr, scan.nextInt()))
                        System.out.println("Element found after "+comparisons+" comparisons.");
                    else
                        System.out.println("Element not found. No. of comparisons : "+comparisons);
                    break;

                case 3:
                    comparisons=0;
                    System.out.println("Enter element to find");
                    if(findElementLinearWithRecursion(arr, scan.nextInt(), 0))
                        System.out.println("Element found after "+comparisons+" comparisons.");
                    else
                        System.out.println("Element not found. No. of comparisons : "+comparisons);
                    break;

                case 4:
                    comparisons=0;
                    System.out.println("Enter element to find");
                    if(findElementBinaryWithoutRecursion(arr, scan.nextInt()))
                        System.out.println("Element found after "+comparisons+" comparisons.");
                    else
                        System.out.println("Element not found. No. of comparisons : "+comparisons);
                    break;

                case 5:
                    comparisons=0;
                    System.out.println("Enter element to find");
                    if(findElementBinaryWithRecursion(arr, scan.nextInt(), 0, arr.length - 1))
                        System.out.println("Element found after "+comparisons+" comparisons.");
                    else
                        System.out.println("Element not found. No. of comparisons : "+comparisons);
                    break;
            
                default:
                    System.out.println("Invalid choice....");
                    break;
            }

        }while(flag);

        scan.close();
        
    }

    public static void displayArrayElements(int[] arr) {
        for (int i : arr) {
            System.out.print(i+"  ");
        }
    }

    public static boolean findElementLinearWithoutRecursion(int[] arr, int key) {
        comparisons = 0;
        for (int i : arr) {
            comparisons++;
            if(key == i)
                return true;
        }
        return false;
    }

    public static boolean findElementLinearWithRecursion(int[] arr, int key, int index) {

        if(index == arr.length)
            return false;

        comparisons++;
        if(key == arr[index])
            return true;
        else
            return ( findElementLinearWithRecursion(arr, key, index+1) );
        
    }

    public static boolean findElementBinaryWithoutRecursion(int[] arr, int key) {

        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int mid = (left+right)/2;

            comparisons++;
            if(key == arr[mid])
                return true;

            if(key < arr[mid]) 
                right = mid - 1;
            else
                left = mid + 1;
        }

        return false;
    }

    public static boolean findElementBinaryWithRecursion(int[] arr, int key, int left, int right) {

        if(left > right)
            return false;

        comparisons++;
        int mid = (left+right)/2;

        if(key == arr[mid])
            return true;

        if(key < arr[mid])
            return ( findElementBinaryWithRecursion(arr, key, left, mid - 1) );
        else
            return ( findElementBinaryWithRecursion(arr, key, mid + 1, right) );

    }
}