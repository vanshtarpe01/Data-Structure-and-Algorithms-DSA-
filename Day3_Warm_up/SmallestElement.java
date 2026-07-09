package Day3_Warm_up;

import java.util.Scanner;

public class SmallestElement{

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

    public static void smallestElement(int arr[]){
        int smallest = arr[0];
        for(int i=0; i<arr.length; i++){
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }

        System.out.print("\nSmallest number is : " + smallest +"\n");
    }

    public static void secondSmallest(int arr[]){
        int smallest = arr[0];
        int secSmallest = arr[1];

        for(int i =0; i<arr.length; i++){
            if(arr[i]< smallest){
                secSmallest = smallest;
                smallest = arr[i];
            }
        }
        System.out.print("Second Smallest number is :- "+ secSmallest + "\n");
    }


    public static void main(String[] args){
        int size;
        System.out.print("Enter a size of an Array : ");
        size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter elements of an Array :- ");
        setArrayElements(arr);
        getArrayElements(arr);
        smallestElement(arr);
        secondSmallest(arr);
    }

}