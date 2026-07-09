import java.util.Scanner;

public class CountDigits{

    public static Scanner sc = new Scanner(System.in);

    public static int countDigits(int num){
        int count =0;
        if(num ==0){
            return 0;
        }

        while(num>0){

            /*
            In this program doesn't need to store digit and reverse number, simply trim the last digit and count it..          
            */
            // int digit = num % 10; 
            num = num/10;
            count++;
        }

        return count;

    }


    public static void main(String args[]){
        System.out.print("Enter a number :- ");
        int num = sc.nextInt();

        System.out.println("The number of digit in number : "+ countDigits(num));

    }

}