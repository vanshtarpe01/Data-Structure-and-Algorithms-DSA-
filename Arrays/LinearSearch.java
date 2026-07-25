import java.util.Scanner;

public class LinearSearch{

    public static Scanner sc = new Scanner(System.in);

    public static void gettingArrayElements(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    public static void traversing(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void linearSearch(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                System.out.println("Targeted element is found at index : " + i);
                return;
            }
        }
    }

    public static void main(String[] args){
        int size, target;
        int[] arr;
        System.out.print("Enter the size of array : ");
        size = sc.nextInt();

        arr = new int[size];
        System.out.println("Enter the elements of an array : ");
        gettingArrayElements(arr);
        System.out.print("Printing elemnets of an array : ");
        traversing(arr);

        
        System.out.print("\nEnter target element : ");
        target = sc.nextInt();

        linearSearch(arr, target);
    }
}