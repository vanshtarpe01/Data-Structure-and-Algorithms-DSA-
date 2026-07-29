import java.util.Scanner;

public class BinarySearch {

    public static Scanner sc = new Scanner(System.in);

    public static void gettingArrayElements(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    public static void tarversing(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void binarySearch(int[] arr, int target){
        int low =0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low+(low+high)/2;

            if(arr[mid]==target){
                System.out.println("Element is pesent at index : "+ mid);
                return;
            }

            if(arr[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
    }

    public static void binarySearchRecursion(int[] arr, int target, int low, int high){
        int mid = low+(low+high)/2;

        if(arr[mid]== target){
            System.out.println("Element is present at index: "+ mid);
            return;
        }else if(arr[mid]<target){
            binarySearchRecursion(arr, target, mid+1, high);
        }else{
            binarySearchRecursion(arr, target, low, mid-1);
        }
    }

    public static void main(String[] args){
        int size;
        System.out.print("Enter a size of an array :- ");
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of an array :- ");
        gettingArrayElements(arr);

        System.out.print("Printing Elements of an Array:- ");
        tarversing(arr);

        System.out.println();

        int target;
        System.out.print("Enter a elemnt that you want to search in array :- ");
        target = sc.nextInt();
        binarySearch(arr, target);
        binarySearchRecursion(arr, target, 0, arr.length-1);

    }
}
