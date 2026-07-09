import java.util.Scanner;

public class PrimeNumber{
    public static Scanner sc = new Scanner(System.in);

    /*
    Prime mumber is divisible only by 1 and number it self... 
    2 --> 1,2 
    3 ---> 1,3
    5 --> 1,5
    7 --> 1,7
    */

    public static boolean isPrimeNumber(int num){
        int divisorCount = 0;
        for(int i=1; i<num+1; i++){
            if(num % i ==0){
                divisorCount++;
                if(divisorCount >2){
                    return false;
                }
            }
        }

        return true;
    }


    public static void main(String[] args){
        System.out.print("Enter a number :- ");
        int num = sc.nextInt();

        System.out.println("Entered number is prime : " + isPrimeNumber(num));
    }
}