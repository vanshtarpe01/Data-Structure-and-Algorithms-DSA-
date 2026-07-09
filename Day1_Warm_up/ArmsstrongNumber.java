import java.util.Scanner;

public class ArmsstrongNumber{
    public static Scanner sc = new Scanner(System.in);

    /*
    ArmsStrong means a number that equals the sum of its own digits, each raised to the power of the total number of digits.
     153 = num =3 
     1^3 + 5^3 + 3^3
     1+125+27 = 153
    */

    public static int countDigits(int num){
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }

        return count;
    }

    public static boolean armsStrongCheck(int num){
        int newNum = num;
        int power = countDigits(num);
        int totalSum =0;
        while(num>0){
            int digit = num%10;
            totalSum += (int) Math.pow(digit, power);
            num = num/10;
        }

        if(totalSum != newNum){
            return false;
        }

        return true;
    }


    public static void main(String args[]){
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Armstrong result of num is : "+ armsStrongCheck(num));
    }
}