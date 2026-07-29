import java.util.Arrays;

public class ReverseUsingSwapping {

    public static void swapping(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void reversed(int[] arr, int start, int end) {
        while (start < end) {
            swapping(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        System.out.println("OG array : " + Arrays.toString(arr));

        reversed(arr, 0, arr.length - 1);
        System.out.println("Reversed Arrray :- " + Arrays.toString(arr));

    }
}