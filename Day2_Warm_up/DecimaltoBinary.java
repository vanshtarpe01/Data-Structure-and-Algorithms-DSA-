package Day2_Warm_up;

import java.util.Scanner;

public class DecimaltoBinary {

    public static Scanner sc = new Scanner(System.in);

    /*
    1 2 4 8 16 32..... Binary number 
    0 1 1 0  0  0   Binary of Decimal 10
    */

    public static String decimalToBinary(int num){

        if(num == 0){
            return "0";
        }
        String binaryString = "";
        while(num>0){
            // Get the remainder digit while ddividing by 2 it gives 1 or 0.
            int remainder = num%2;

            //  MSB + LSB
            binaryString = remainder + binaryString;

            // Dividing number by 2
            num = num/2;
        }

        return binaryString;
    }

    public static void main(String[] args){
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.println("Binary number :- "+ decimalToBinary(num));

    }
}
