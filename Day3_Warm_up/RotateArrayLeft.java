import java.util.Scanner;

public class RotateArrayLeft {

    public static Scanner sc = new Scanner(System.in);

    public static void setArrayElements(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void getArrayElements(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void reverseArrayElements(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
    }

    public static void rotateArrayLeft(int arr[], int d) {
        int n = arr.length;

        if (n == 0)
            return;

        d = d % n; // 3 % 5 = 2

        // Step 1: Reverse the first D elements
        reverseArrayElements(arr, 0, d - 1);

        // Step 2: Reverse the remaining elements
        reverseArrayElements(arr, d, n - 1);

        // Step 3: Reverse the whole array
        reverseArrayElements(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        System.out.print("Enter no of elements in Array : ");
        int size = sc.nextInt();
        int d = 2;
        int[] arr = new int[size];
        System.out.println("Enter elements of an Array : ");
        setArrayElements(arr);
        System.out.println("Printing an elements of an array before reversing : ");
        getArrayElements(arr);
        // reverseArrayElements(arr, 0, arr.length - 1);
        // System.out.println("Printing an elemnets of an array after reversing : ");
        // getArrayElements(arr);
        rotateArrayLeft(arr, d);
        System.out.println("Printing an elemnets of an array after rotating left : ");
        getArrayElements(arr);
    }
}
