package Day2_Warm_up;
import java.util.Scanner;

public class HollowSquare{
    public static Scanner sc = new Scanner(System.in);

    public static void hollowSquare(int size){
        for(int i=1; i<=size; i++){
            for(int j=1; j<= size; j++){

                // Top,Left, Right and Bottom other things are empty
                if(i==1 || i==size || j==1 || j==size ){
                    System.out.print("*    ");
                }else{
                    System.out.print("     ");
                }
            }
            System.out.println();
            System.out.println();
        }
    }


    public static void main(String[] args){
        int size; 
        System.out.print("Enter a Size  : ");
        size = sc.nextInt();

        hollowSquare(size);
    }
}