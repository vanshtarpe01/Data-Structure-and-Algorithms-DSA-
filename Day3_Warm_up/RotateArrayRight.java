import java.util.Scanner;
public class RotateArrayRight{
    public static Scanner sc = new Scanner(System.in);


    public static void setArrayElements(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    public static void getArrayElements(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverseArrayElements(int arr[], int start, int end){
        while(start<end){
            int temp  = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void rotateArrayRight(int arr[], int d){
        int n = arr.length;
        if(n==0) return;

        reverseArrayElements(arr, n-d, n-1);


        reverseArrayElements(arr, 0, n-d-1);


        reverseArrayElements(arr, 0, n-1);
    }

    public static void main(String[] args){
        System.out.print("Enter a no of elements of an array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int d = 2;

        System.out.println("Enter elements of an array : ");
        setArrayElements(arr);
        System.out.println("Printing original array elements : ");
        getArrayElements(arr);
        // reverseArrayElements(arr, 0, arr.length-1);
        // System.out.println("Printing array elements reversly : ");
        // getArrayElements(arr);
        rotateArrayRight(arr, d);
        System.out.println("Printing array elements after Rotate Right : ");
        getArrayElements(arr);
    }
}