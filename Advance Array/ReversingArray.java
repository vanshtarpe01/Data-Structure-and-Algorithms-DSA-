import java.util.Arrays;

public class ReversingArray{

    public static int[] reversed(int[] arr){
        int[] reversed = new int[arr.length];
        int newIndex =0;
        for(int i=arr.length-1; i>=0; i--){
            reversed[newIndex] = arr[i];
            newIndex++;
        }

        return reversed;
    }

    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Printing OG array : "+ Arrays.toString(arr));
        int[] newArr = reversed(arr);
        System.out.print("Reversed Array : "+ Arrays.toString(newArr));

    }
}