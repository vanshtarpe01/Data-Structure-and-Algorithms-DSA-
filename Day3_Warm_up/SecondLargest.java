import java.util.Scanner;

public class SecondLargest{

    public static Scanner sc = new Scanner(System.in);

    public static void getArrayElements(int arr[]){
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    public static void  printArrayElements(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void secondLargest(int arr[]){
        int largest = arr[0];
        int secondLar = arr[1];
        for(int i=0; i<arr.length; i++){
           // Case 1: Found a number greater than the current largest
            if (arr[i] > largest) {
                secondLar = largest; // Old largest drops down to second place
                largest = arr[i];    // Update largest to the new highest value
            } 
           
        }

        System.out.println("Second largest number is : "+ secondLar);
    }



    public static void main(String[] args){
        int size;
        System.out.print("Enter a size of array : ");
        size = sc.nextInt();

        int[] arr = new int[size];

        getArrayElements(arr);
        printArrayElements(arr);
        secondLargest(arr);

    }
}