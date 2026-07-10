package Day4_Warmup;
import java.util.Scanner;
public class MissingNumber {
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

    public static int getTotalSum(int arr[]){
        int sum =0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    public static int missingNumber(int arr[],int range){
        int expected_sum = (range*range+1)/2;

        int missing = getTotalSum(arr) - expected_sum;

        return missing;
    }

    public static void main(String[] args){
        System.out.print("Enter the size of an array : ");
        int range = sc.nextInt();

        int arr[] = new int[range];
        System.out.print("Enter the elements of an array in a range : ");

        setArrayElements(arr);

        System.out.println("Printing elements of an array : ");
        getArrayElements(arr);

        System.out.println("Getting the total sum of Array elements : \n"+ getTotalSum(arr));

        System.out.println("Printing the missing number : \n" + missingNumber(arr,range));

    }
}
