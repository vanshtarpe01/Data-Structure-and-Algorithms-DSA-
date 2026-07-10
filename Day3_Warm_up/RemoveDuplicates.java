import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

    public static Scanner sc = new Scanner(System.in);

    public static void setArrayElements(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Modified to accept a custom length so we don't print trailing zeros
    public static void getArrayElements(int arr[], int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void removeDuplicates(int arr[]) {
        if (arr.length == 0 || arr.length == 1) {
            getArrayElements(arr, arr.length);
            return;
        }

        // Step 1: Sort the array so duplicates are adjacent
        Arrays.sort(arr);

        // Step 2: Use a unique pointer index to overwrite duplicates in-place
        int uniqueIndex = 0; 

        for (int i = 0; i < arr.length; i++) {
            // If the current element is different from the next element, it's unique
            // (Always include the very last element of the array)
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                continue;
            }
            
            arr[uniqueIndex] = arr[i];
            uniqueIndex++;
        }

        // Step 3: Print only up to the total number of unique elements found
        System.out.println("\nArray after removing duplicates: ");
        getArrayElements(arr, uniqueIndex);
    }

    public static void main(String[] args) {
        int arrSize;
        System.out.print("Enter length of an Array :- ");
        arrSize = sc.nextInt();

        int arr[] = new int[arrSize];                      
        System.out.println("Enter elements of an array : ");
        setArrayElements(arr);
        
        System.out.print("Original Array Elements : ");
        getArrayElements(arr, arr.length);

        removeDuplicates(arr);
    }
}