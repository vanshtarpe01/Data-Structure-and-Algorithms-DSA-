import java.util.Scanner;

public class StrongNumber {

    public static Scanner sc = new Scanner(System.in);

    /*
     * A Strong number is a special number where the sum of the factorials of its
     * individual digits is equal to the original number itself.
     * 145 = 1! + 4! + 5!
     * 1! = 1*1+1*0 = 1
     * 4! = 4*3*2*1 = 24
     * 5! = 5*4*3*2*1 = 120
     */

    public static int fact(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * fact(num - 1);
    }

    public static boolean strongNumberorNot(int num) {
        int newNum = num;
        int strongNumber = 0;
        while (num > 0) {
            int digit = num % 10;
            strongNumber += fact(digit);
            num = num/10;
        }

        if(newNum == strongNumber){
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        
        System.out.println("You entered number is a strong number : "+ strongNumberorNot(num));

    }
}