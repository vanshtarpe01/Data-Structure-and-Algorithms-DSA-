import java.util.Scanner;

public class DeleteAllOccurences {
    public static Scanner sc = new Scanner(System.in);

    public static void setArrayElements(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    public static void getArrayElements(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void deleteAllOccurences(int arr[], int num){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] ==num){
                count++;
            }
        }

        if(count==0){
            System.out.println("Entered number is not exists in array..");
            return;
        }

        int newArr[] = new int[arr.length-count];
        int newIndex =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){
                continue;
            }

            newArr[newIndex] = arr[i];
            newIndex++;
        }

        getArrayElements(newArr);
    }

    public static void main(String[] args){
        System.out.print("Enter no of elements of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter elements of an Array : " );
        setArrayElements(arr);
        System.out.println("Printing elements of an array : ");
        getArrayElements(arr);

        System.out.print("Enter a elemeyou that you want to delete : ");
        int elem = sc.nextInt();

        System.out.println();
        deleteAllOccurences(arr, elem);
    }
}