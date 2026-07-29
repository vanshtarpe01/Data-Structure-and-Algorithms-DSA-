public class MinMax{

    public static int min(int[] arr){
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int max(int[] arr){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Maximum : " + max(arr));
        System.out.println("Minimum : " + min(arr));
    }
}