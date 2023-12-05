
import java.util.Scanner;

public class SortingAlgo {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {500, 800, 100, 900, 200, 400, 1000, 300, 700, 600, 300, 500};

        boolean flag = true;

        do{

            System.out.println("\n0.Exit \n1.Display array elements \n2.Unsort the given array \n3.Selection Sort");
            System.out.println("Enter choice : ");
            switch (scan.nextInt()) {
                case 0:
                    System.out.println("Exited...");
                    flag=false;
                    break;

                case 1:
                    System.out.println("Array elements are : ");
                    displayArrayElements(arr);
                    break;

                case 2:
                    int[] a = {500, 800, 100, 900, 200, 400, 1000, 300, 700, 600, 300, 500};
                    arr = a;
                    break;

                case 3:
                    sortArrayBySelection(arr);
                    break;
            
                default:
                    break;
            }

        }while(flag);
    }

    public static void displayArrayElements(int[] arr) {
        for (int i : arr) {
            System.out.print(i+"  ");
        }
    }

    public static void swapArrayElements(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortArrayBySelection(int[] arr) {
        int iterations=0;
        int comparisons=0;

        for(int i=0; i < arr.length - 1; i++) {
            iterations++;
            for(int j=i+1; j < arr.length; j++) {
                comparisons++;
                if(arr[j] < arr[i])
                    swapArrayElements(arr, i, j);
            }
        }

        System.out.println("No of iterations : "+iterations);
        System.out.println("No of comparisons : "+comparisons);
    }
}
