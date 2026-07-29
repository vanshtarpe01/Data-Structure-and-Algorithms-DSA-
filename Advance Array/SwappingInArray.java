import java.util.Scanner;

public class SwappingInArray{
    public static Scanner sc = new Scanner(System.in);

    public static void printingElemnets(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void gettingElementsOfAnArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    public static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

        printingElemnets(arr);
    }

    public static void main(String[] args){
        int size;
        System.out.print("Enter the size of an array :- ");
        size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of an array :- ");
        gettingElementsOfAnArray(arr);

        System.out.println("Printing Elements of an Array :- ");
        printingElemnets(arr);
        int index1, index2;
        System.out.print("\nEnter 1st index that you want to swap :- ");
        index1 = sc.nextInt();
        System.out.print("Enter 2nd index that you want to swap :- ");
        index2 = sc.nextInt();

        System.out.println("Array after swapping the indexes :- ");
        swap(arr, index1, index2);
        
    }
    
}