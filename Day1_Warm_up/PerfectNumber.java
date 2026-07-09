import java.util.Scanner;

public class PerfectNumber{

    public static Scanner sc = new Scanner(System.in);

    /*
    A Perfect number is a positive integer that is equal to the sum of all its proper positive divisors
    Divisor of 6 is 1,2 and 3,
    sum of it = 1+2+3 = 6
    */

    public static boolean isPerfectNumber(int num){
        int sumOfDivisor = 0;
        for(int i=1; i<num; i++){
            if(num%i ==0){
                sumOfDivisor += i;
            }
        }

        if(sumOfDivisor ==num){
            return true;
        }

        return false;
    }


    public static void main(String[] args){
        System.out.print("Enter a number :- ");
        int num = sc.nextInt();

        System.out.println("Entered number is perfect number : "+isPerfectNumber(num));
    }
}