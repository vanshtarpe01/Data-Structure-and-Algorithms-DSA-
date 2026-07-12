package Day4_Warmup;

import java.util.Scanner;

public class Intersection {
    public static Scanner sc = new Scanner(System.in);

    public static void setArrayElements(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void printArrayElements(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void intersection(int arr1[], int arr2[]) {
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            // 1. Skip duplicate elements within arr1
            while (i > 0 && i < arr1.length && arr1[i] == arr1[i - 1]) {
                i++;
            }
            // 2. Skip duplicate elements within arr2
            while (j > 0 && j < arr2.length && arr2[j] == arr2[j - 1]) {
                j++;
            }

            // Double check bounds after skipping duplicates
            if (i >= arr1.length || j >= arr2.length) {
                break;
            }

            // 3. Compare current elements
            if (arr1[i] < arr2[j]) {
                i++; // Move arr1 pointer forward if its element is smaller
            } else if (arr2[j] < arr1[i]) {
                j++; // Move arr2 pointer forward if its element is smaller
            } else {
                // Elements match! Print it because it's in both arrays
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int sizeArr1;
        int sizeArr2;
        System.out.print("Enter size of Array 1 : ");
        sizeArr1 = sc.nextInt();
        int arr1[] = new int[sizeArr1];
        System.out.print("Enter elements of array 1 : ");
        setArrayElements(arr1);

        System.out.print("Enter size of Array 2 : ");
        sizeArr2 = sc.nextInt();
        int arr2[] = new int[sizeArr2];
        System.out.println("Enter elements of array 2 : ");
        setArrayElements(arr2);

        System.out.println("\n Printing elements of Array 1 : ");
        printArrayElements(arr1);
        System.out.println("\n Printing elements of Array 2 : ");
        printArrayElements(arr2);

        System.out.println("Printing intersection elements of Array 1 and Array 2 : ");
        intersection(arr1, arr2);

    }
}
