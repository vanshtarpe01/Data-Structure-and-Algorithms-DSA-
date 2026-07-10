package Day4_Warmup;
import java.util.Scanner;
public class MoveZeros {
 
    public static Scanner sc= new Scanner(System.in);

    public static void setArrayElements(int arr[]){
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    public static void getArrayElements(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void moveZeros(int arr[]){
        int insertPos =0;
        for(int i=0; i<arr.length; i++){
          if(arr[i]!=0){
            arr[insertPos] = arr[i];
            insertPos++;
          }

        }

        while(insertPos < arr.length){
            arr[insertPos] = 0;
            insertPos++;
        }

        getArrayElements(arr);
    }

    public static void main(String[] args){
        System.out.print("Enter a size of a Array : ");
        int size = sc.nextInt();


       int arr[] = new int[size];
       System.out.print("Enter elements of an Array : ");
       setArrayElements(arr);

       System.out.println("Printing elements of an Array : ");
       getArrayElements(arr);

       System.out.println("Moving all zeros at the end : ");
       moveZeros(arr);
    }
}
