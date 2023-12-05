
import java.util.Scanner;

public class SortingAlgo {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {500, 800, 100, 900, 200, 400, 1000, 300, 700, 600, 300, 500};

        boolean flag = true;

        do{

            System.out.println("\n\n0.Exit \n1.Display array elements \n2.Unsort the given array \n3.Selection Sort \n4.Bubble Sort without flag \n5.Bubble Sort with flag \n6.Insertion Sort");
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
                    System.out.println("Array un-sorted");
                    break;

                case 3:
                    System.out.println("Unsorted array elements : ");
                    displayArrayElements(arr);
                    sortArrayBySelection(arr);
                    System.out.println("Sorted by Selection Sort array elements are : ");
                    displayArrayElements(arr);
                    break;
                
                case 4:
                    System.out.println("Unsorted array elements : ");
                    displayArrayElements(arr);
                    sortArrayByBubbleSortWithoutFlag(arr);
                    System.out.println("Sorted by Bubble Sort without flag array elements are : ");
                    displayArrayElements(arr);
                    break;

                case 5:
                    System.out.println("Unsorted array elements : ");
                    displayArrayElements(arr);
                    sortArrayByBubbleSortWithFlag(arr);
                    System.out.println("Sorted by Bubble Sort with flag array elements are : ");
                    displayArrayElements(arr);
                    break;

                case 6:
                    System.out.println("Unsorted array elements : ");
                    displayArrayElements(arr);
                    sortArrayByInsertionSort(arr);
                    System.out.println("Sorted by Insertion Sort array elements are : ");
                    displayArrayElements(arr);
                    break;
            
                default:
                    System.out.println("Invalid choice !");
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

        System.out.println("\nNo of iterations : "+iterations);
        System.out.println("No of comparisons : "+comparisons);
    }

    public static void sortArrayByBubbleSortWithoutFlag(int[] arr) {
        int iterations=0;
        int comparisons=0;

        for(int i=0; i < arr.length - 1; i++) {
            iterations++;
            for(int j=0; j < arr.length - i - 1; j++) {
                comparisons++;
                if(arr[j] > arr[j+1])
                    swapArrayElements(arr, j, j+1);
            }
        }

        System.out.println("\nNo of iterations : "+iterations);
        System.out.println("No of comparisons : "+comparisons);
    }

    public static void sortArrayByBubbleSortWithFlag(int[] arr) {
        int iterations=0;
        int comparisons=0;
        boolean flag = true;

        for(int i=0; i < arr.length - 1 && flag; i++) {
            iterations++;
            flag = false;
            for(int j=0; j < arr.length - i - 1; j++) {
                comparisons++;
                if(arr[j] > arr[j+1]){
                    swapArrayElements(arr, j, j+1);
                    flag = true;
                }
                    
            }
        }

        System.out.println("\nNo of iterations : "+iterations);
        System.out.println("No of comparisons : "+comparisons);
    }

    public static void sortArrayByInsertionSort(int[] arr) {
        int iterations=0;
        int count=0;

        for(int i=0; i < arr.length; i++) {
            iterations++;
            int key = arr[i];
            int j = i-1;

            while(j >= 0 && key < arr[j]) {
                arr[j+1] = arr[j];
                j--;
                count++;
            }

            arr[j+1] = key;
        }

        System.out.println("\nNo of iterations : "+iterations);
        System.out.println("No of while loop count : "+count);
    }
}
