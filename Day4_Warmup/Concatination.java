package Day4_Warmup;

import java.util.Scanner;
public class Concatination {

    public static Scanner sc = new Scanner(System.in);

    public static void getArrayElemnets(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    public static void printArrayElements(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void concat(int arr1[], int arr2[]){
        int unionArr[] = new int[arr1.length+arr2.length];
        int newIndex = 0;
        for(int i=0; i<arr1.length; i++){
            unionArr[newIndex] = arr1[i];
            newIndex++;
        }
        for(int i=0; i<arr2.length; i++){
            unionArr[newIndex] = arr2[i];
            newIndex++;
        }

        System.out.println("Printing the Union Array : ");
        printArrayElements(unionArr);
    }
    public static void main(String[] args){
        int sizeArr1;
        int sizeArr2;
        System.out.print("Enter the size of array 1 : ");
        sizeArr1 = sc.nextInt();
        int arr1[] = new int[sizeArr1];
        System.out.println("Enter elements of array 1 : ");
        getArrayElemnets(arr1);
        System.out.print("Enter the size of array 2 : ");
        sizeArr2 = sc.nextInt();
        int arr2[] = new int[sizeArr2];
        System.out.println("Enter elements of array 2 : ");
        getArrayElemnets(arr2);
        System.out.println("\n Printing elements of a array 1 : ");
        printArrayElements(arr1);
        System.out.println("\n Printing elements of array 2 : ");
        printArrayElements(arr2);
        concat(arr1, arr2);
    }
}
