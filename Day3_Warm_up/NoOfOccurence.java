import java.util.Scanner;
public class NoOfOccurence{
    public static Scanner sc = new Scanner(System.in);

    public static void setArrayElement(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    public static void printArrayELement(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
    }

    public static int occurence(int arr[], int num){
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args){
        System.out.print("Enter no of elements of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter elements of an array : ");
        setArrayElement(arr);
        System.out.println();

        System.out.print("Enter a number for checking occurence of it : ");
        int num = sc.nextInt();

        System.out.println(occurence(arr, num));

    }

}