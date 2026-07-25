public class ArrayOperations{
    public static void traversing(int[] arr, int lb, int ub){
        while(lb<=ub){
            System.out.print(arr[lb]+ " ");
            lb++;
        }
    }
    public static int insertion(int[] arr, int n, int pos, int item){
        for(int i=n; i<pos; i--){
            arr[i+1] = arr[i];
        }

        // int i= n;  
        // while(pos>=i){   
        //     arr[i+1] = arr[i]; 
        //     i--;
        // }

        arr[pos] = item;
        n++;

        return n;
    }
    public static int deletion(int[] arr, int n, int pos){
        int deletedItem = arr[pos];
        int i = pos;
        while(i<n-1){
            arr[i] = arr[i+1];
            i++;
        }
        n--;

        // for(int i=pos; i<n-1; i++){
        //     arr[i] = arr[i+1];
        // }
        // n--;
        return deletedItem;

    }

    public static void main(String[] args){
        int[] arr = new int[6];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int n=5;

        System.out.print("Printing array before performing any operations : ");
        traversing(arr, 0, n-1);
        System.out.println();
        insertion(arr, arr.length, 2, 350);
        traversing(arr, 0, n);
        System.out.println();
        // deletion(arr, arr.length, 2);
        // traversing(arr, 0, n-2);

    }
}