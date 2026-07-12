package Day4_Warmup;
import java.util.Scanner;
public class UnionArray {
    public static Scanner sc = new Scanner(System.in);

    public static void setArrayElements(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    public static void printArrayElements(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +  " ");
        }
    }

    public static void unionArray(int arr1[], int arr2[]){
        int i = 0, j = 0;
        
        // Loop runs until we reach the end of either array
        while(i < arr1.length && j < arr2.length){
            
            // 1. Skip duplicate elements within arr1
            while(i > 0 && i < arr1.length && arr1[i] == arr1[i-1]) {
                i++;
            }
            // 2. Skip duplicate elements within arr2
            while(j > 0 && j < arr2.length && arr2[j] == arr2[j-1]) {
                j++;
            }
            
            // Double check bounds after skipping duplicates
            if(i >= arr1.length || j >= arr2.length) {
                break;
            }

            // 3. Compare current elements from both arrays
            if(arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } 
            else if(arr2[j] < arr1[i]) {
                System.out.print(arr2[j] + " ");
                j++;
            } 
            else { // If they are equal, print once and move both pointers
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }

        // 4. Print remaining elements of arr1 (if any left)
        while(i < arr1.length){
            if(i == 0 || arr1[i] != arr1[i-1]) {
                System.out.print(arr1[i] + " ");
            }
            i++;
        }

        // 5. Print remaining elements of arr2 (if any left)
        while(j < arr2.length){
            if(j == 0 || arr2[j] != arr2[j-1]) {
                System.out.print(arr2[j] + " ");
            }
            j++;
        }
    }

    public static void main(String[] args){
        int sizeArr1;
        int sizeArr2;
        System.out.print("Enter the size of array 1 : ");
        sizeArr1 = sc.nextInt();
        int arr1[] = new int[sizeArr1];
        System.out.print("Enter elements of array 1 : ");
        setArrayElements(arr1);
        System.out.print("Enter the size of array 2 : ");
        sizeArr2 = sc.nextInt();
        int arr2[] = new int[sizeArr2];
        System.out.print("Enter elements of array 2 : ");
        setArrayElements(arr2);
        System.out.println(" \n Printing elements of Array 1 : ");
        printArrayElements(arr1);
        System.out.println("\n Printing elements of Array 2 : ");
        printArrayElements(arr2);

        System.out.print("\n Printing elements of unionArray : ");
        unionArray(arr1, arr2);
    } 
}
