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

    // public static void binarySearch(int[] arr, int target)

    public static void main(String[] args){

    }
}
