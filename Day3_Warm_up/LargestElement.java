import java.util.Scanner;
public class LargestElement{
    public static Scanner sc = new Scanner(System.in);

    public static void getInput(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void largest(int arr[]){
        int largest = arr[0];
        int index =0;
        for(int i=0; i<arr.length; i++){
            if(largest<arr[i]){
                largest = arr[i];
                index = i;
            }
        }

        System.out.println("Largest number is : "+ largest + " at index : "+ index);
    }


    public static void main(String[] args){
        int size;
        System.out.print("Enter size of an array: ");
        size = sc.nextInt(); 
        int[] arr = new int[size];
        System.out.println("Enter Elements of an Array : ");
        getInput(arr);
    
        printArray(arr);
        System.out.println();
        largest(arr);
    }
}