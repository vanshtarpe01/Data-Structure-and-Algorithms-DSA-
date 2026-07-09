package Day2_Warm_up;

import java.util.Scanner;

public class Power {
    public static Scanner sc = new Scanner(System.in);

    public static int power(int num, int power){
        int powRes = 1;

        for(int i=1; i<=power; i++){
            powRes = powRes*num;
                    // 2*1 =2
                    // 2*2 =4
                    // 2*3 = 8
        }

        return powRes;
    }

    public static void main(String[] args){
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        System.out.print("Enter a power : ");
        int power = sc.nextInt();

        int result = power(num, power);
        System.out.println("Result : "+ result);
    }
}
