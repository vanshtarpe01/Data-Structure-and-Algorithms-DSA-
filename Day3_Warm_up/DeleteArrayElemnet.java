import java.util.Scanner;

public class DeleteArrayElemnet {
    
    public static Scanner sc = new Scanner(System.in);

    public static void setArrayElements(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
    }

    public static void getArrayElemnets(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void deleteArrayElement(int arr[], int num){
        
        int count =0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] ==num){
                count++;
            }
        }
        
        if(count==0){
            System.out.print("Entered elemnet doesnt exists in the array");
            return;
        }
        
        int newArray[] = new int[arr.length-1];

        int newIndex =0;
        for(int i=0; i<arr.length; i++){
            if(num == arr[i]){
                continue;
            }

            newArray[newIndex] = arr[i];
            newIndex++;
        }
        System.out.println();
        getArrayElemnets(newArray);
    }

    public static void main(String[] args){
        System.out.print("Enter no of elements of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.print("Enter elements of an array : ");
        setArrayElements(arr);
        System.out.println("Printing elements of an array : ");
        getArrayElemnets(arr);

        System.out.print("Enter a element which you want to delete : ");
        int num = sc.nextInt();

        deleteArrayElement(arr, num);
    }

}
