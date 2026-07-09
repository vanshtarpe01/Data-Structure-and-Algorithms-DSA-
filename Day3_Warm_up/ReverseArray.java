import java.util.Scanner;

public class ReverseArray{
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
        System.out.println();
    }

    public static void reverseArrayElements(int arr[]){
        for(int i= arr.length-1; i>=0; i--){
            // arr.length = 5-1 = 4 [0, 1, 2, 3, 4]
            // arr[4] means last index
            // i>=0 = i = 0 or i > 0
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        System.out.print("Enter the number of elements of an Array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter elements of an Array : ");
        setArrayElements(arr);
        getArrayElements(arr);
        reverseArrayElements(arr);
    }
}