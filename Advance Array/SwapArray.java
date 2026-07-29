public class SwapArray{

    public static void traverse(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        traverse(arr);
        System.out.println();
        int[] arr1 = arr;
        traverse(arr1);
        System.out.println("----------------------------------------");
        arr1[0] =100;
        System.out.print("Printing array after updating index : "); 
        traverse(arr);            
        System.out.print("\nPrinting array1 after updating index : ");
        traverse(arr1);

        int[] arr3 = {90, 80, 70, 60, 10};
        traverse(arr3);

        System.out.println("\nSwapping arr into arr3 by using third array");
        arr= arr3;
        arr3 = arr1;
        
        System.out.println("Array 1{arr} :");
        traverse(arr);
        System.out.println("\nArray 2{arr3} :");
        traverse(arr3);
        System.out.println("\nArray 3{arr1} :");
        traverse(arr1);
        
    }
}