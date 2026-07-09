import java.util.Scanner;

public class AutomorphicNumber{
    public static Scanner sc = new Scanner(System.in);

    /*
    An Automorphic number is a number whose square ends in the same digits as the number itself.
    square of 5 is 5*5 = 25 ends with 5... 
    */


    public static int countDigits(int num){
        int count =0;
        while(num>0){
            count++;
            num = num/10;
        }

        return count;
    }

    public static boolean isAutomorphicNumber(int num){
        int square = num*num;
        int numCount = countDigits(num);

        int lastDigitofSquare =0;
        for(int i=0; i<numCount; i++){
            int digit = square%10;
            lastDigitofSquare = (lastDigitofSquare*10)+digit;
            square = square/10;
        }

        if(num == lastDigitofSquare){
            return true;
        }

        return false;

    }

    public static void main(String[] args){
        System.out.print("Enter a number :- ");
        int num = sc.nextInt();

        System.out.println("Is you enetered number is Automorphic Number : " + isAutomorphicNumber(num));
    }

}