package Day2_Warm_up;

import java.util.Scanner;

public class LCM {

    public static Scanner sc = new Scanner(System.in);

    /*
    num1 num2
    9    12
    largest 12
    lcm 12
    1st Iteration                          2nd Iteration                    3rd Iteration
    if 12%9 == 0 and 12%12 == 0 false    12%9 == 0 and 24%12 == 0 flase   36%9==0 and 36%12 ==0 true   
    else lcm += largest 12+12 = 24         lcm + largest 24+12 = 36         not needed

    */

    public static int lcm(int num1, int num2) {
        int largest = num1;
        if(largest < num2){
            largest = num2;
        }

        int lcm = largest;

        while(true){
            if(lcm % num1 ==0 && lcm % num2 ==0){
                return lcm;
            }

            lcm += largest;
        }
    }

    public static void main(String[] args) {
        int num1, num2;
        System.out.print("Enter a 1st number : ");
        num1 = sc.nextInt();
        System.out.print("Enter a 2nd number : ");
        num2 = sc.nextInt();

        System.out.println("LCM of the entered number : "+ lcm(num1, num2));
    }

}