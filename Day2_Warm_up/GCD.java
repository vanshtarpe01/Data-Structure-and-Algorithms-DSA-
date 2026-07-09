package Day2_Warm_up;

import java.util.Scanner;

public class GCD {

    public static Scanner sc = new Scanner(System.in);

    // Using Normal Method
    public static int gcdNormal(int num1, int num2) {
        int smallest = num1;
        if (smallest > num2) {
            smallest = num2;
        }

        int gcd = 1;

        for (int i = 1; i <= smallest; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                if (gcd < i) {
                    gcd = i;
                }
            }
        }

        return gcd;

    }

    /*
     * num1 num2
     * 12 18
     * division remainder
     * 18/12 6
     * 12/6 0
     * GCD = remainder
     */

    public static int euclideanGCD(int num1, int num2) {
        // Base case: if the first number is 0, the GCD is the second number
        if (num1 == 0) {
            return num2;
        }

        // Recursive case: pass the remainder (num2 % num1) and the old num1
        return euclideanGCD(num2 % num1, num1);
    }

    public static int euclideanLoopGCD(int num1, int num2) {

        int remainder = 0;
        while (num1 != 0) {
            remainder = num2%num1;

            num2 = num1;
            num1 = remainder;
        }


        return num2;
    }

    public static void main(String[] args) {
        int num1, num2;
        System.out.print("Enter a first number : ");
        num1 = sc.nextInt();
        System.out.print("Enter a second number : ");
        num2 = sc.nextInt();

        System.out.println("GCD of the entered number using Normal method: " + gcdNormal(num1, num2));
        System.out.println("GCD of the entered number using Euclidean Method: " + euclideanGCD(num1, num2));
        System.out.println("GCD of the entered number using Euclidean Loop Method: " + euclideanLoopGCD(num1, num2));
    }
}