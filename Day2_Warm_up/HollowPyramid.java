package Day2_Warm_up;

import java.util.Scanner;

public class HollowPyramid {
    
    public static Scanner sc = new Scanner(System.in);


    public static void printHollowPyramid(int size){
        for(int i =0; i<size; i++){
           // 1. Print the leading spaces to center-align the pyramid
            for(int j=0; j<size-i-1; j++){
                System.out.print(" ");
            }


            // 2. Print the stars and hollow spaces
            for(int j=0; j<(2*i+1); j++){
                // Print star if it's the first column, last column, or the final bottom row
                if(j==0 || j== (2*i) || i == size-1){
                    System.out.print("*");
                }
                else{
                    // Inside the pyramid gets a blank space
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }


    public static void main(String[] args){
        int size;
        System.out.println("Enter a size : ");
        size = sc.nextInt();

        printHollowPyramid(size);
    }

}
