import java.util.Scanner;
public class CountAllOccurences {
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

     public static void countAllOccurences(int arr[]){
        boolean visited[] = new boolean[arr.length];

        for(int i=0; i<arr.length; i++){
            if(visited[i] == true){
                continue;
            }

            int count =1;
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    visited[j] = true;
                    count++;
                }
            }

            System.out.print("Element "+ arr[i]+ ":" + " Count " + count + "\n");
        }
        System.out.println();
     }

    public static void main(String[] args){
        System.out.print("Enter a number of element of an array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.print("Enter elements of an Array : ");
        setArrayElements(arr);
        System.out.println("Printing elements of an Array : ");
        getArrayElements(arr);
        System.out.println();
        countAllOccurences(arr);       
    }
}
