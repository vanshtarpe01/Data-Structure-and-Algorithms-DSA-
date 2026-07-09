import java.util.Scanner;

public class ReverseNumber {

    public static Scanner sc = new Scanner(System.in);

    // Reverse a Number
    // 1234 -> 4321
    public static void reverseNumber(){
        System.out.println("Enter a Number :- ");
        int number = sc.nextInt();

        int reversed_num = 0;

        if(number<=0){
            return;
        }

        System.out.println("You entered number : "+ number);

       while( number >0 ){
        int digit = number % 10;     // To get last digit {Extracts the rightmost digit of the remaining number.}
        reversed_num = (reversed_num * 10) + digit; // Shifts the left digit by 10 {Shifts the existing reversed digits one place value to the left (tens to hundreds, etc.) and appends the new digit to the end.}
        number = number/10; // Trims the last digit of original number {Trims the rightmost digit off the original number.}
       }

       System.out.println("Reversed Number : "+ reversed_num);

    }

    public static void main(String[] args){
        reverseNumber();
    }
    
}
