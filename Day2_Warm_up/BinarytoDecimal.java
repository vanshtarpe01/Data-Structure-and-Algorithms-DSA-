package Day2_Warm_up;

import java.util.Scanner;

public class BinarytoDecimal {
    
    public static Scanner sc = new Scanner(System.in);

    public static int binaryToDecimal(int binaryNum){
        int decimalNumber = 0;
        int power =0;
        while(binaryNum>0){
            // Get the last digit
            int digit = binaryNum %10;
            decimalNumber = decimalNumber+ digit* (int) Math.pow(2, power);

            power++;

            // Trims the last didgit
            binaryNum = binaryNum/10;

        }

        return decimalNumber;

    }

    public static void main(String[] args){
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.println("Decimal Number : "+ binaryToDecimal(num));

    }
}
