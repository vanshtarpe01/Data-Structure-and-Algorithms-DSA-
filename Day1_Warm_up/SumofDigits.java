import java.util.Scanner;

public class SumofDigits{
   public static Scanner sc = new Scanner(System.in);

   /*
   In this program need to store/get the digit and trims the digit..
   */

   public static int sumofDigits(int num){
    int sum = 0;
    while(num >0){
        int digit = num %10;  // Getting the last digit
        sum += digit; // Adding the last digit
        num = num/10;  // Trims the last digit
    }

    return sum;
   }
    
    public static void main(String[] args){
        System.out.print("Enter a number :- ");
        int num = sc.nextInt();

        System.out.println("Sum of digits of a entered number : "+ sumofDigits(num));
        
    }

}
