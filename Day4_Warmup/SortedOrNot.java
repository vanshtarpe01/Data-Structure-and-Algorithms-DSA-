package Day4_Warmup;

import java.util.Scanner;

public class SortedOrNot {

    public static Scanner sc = new Scanner(System.in);

    public static void setElementsOfArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void getElementsOfArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static boolean isSorted(int arr[]) {
        if (arr.length <= 1) {
            return false;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.print("Enter a size of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter elements of an Array : ");
        setElementsOfArray(arr);

        System.out.print("Printing elements of an array : ");
        getElementsOfArray(arr);

        System.out.println("Result....");
        System.out.println(isSorted(arr));
    }
}
