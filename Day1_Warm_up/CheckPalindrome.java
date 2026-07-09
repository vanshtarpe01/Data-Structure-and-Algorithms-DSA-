import java.util.Scanner;

public class CheckPalindrome{

    public static Scanner sc = new Scanner(System.in);

    public static boolean checkPalindrome(int num){
        int newNum = num;
        int reversed_num = 0;
        while(num >0){
            int digit = num %10; // Extract the lastDigit
            reversed_num = (reversed_num *10) + digit; // Shits digit to left by hundreds, thousands,etc and add digit into it
            num = num / 10;  // Trims last digit from original number
        }

        if(newNum != reversed_num){
            return false;
        }

        return true;
    }

    public static void main(String[] args){
     
        System.out.print("Enter a number to check whether the number is palindrome or not :- ");
        int num = sc.nextInt();
        boolean result = checkPalindrome(num);

        if(!result){
            System.out.println("Entered number is not a palindrome number.....");
        }else{
            System.out.println("Entered number is a palindrome number");
        }
    }
}