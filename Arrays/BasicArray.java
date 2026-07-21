package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class BasicArray {

    public static void main(String[] args) {
        // Array is a collection of a smae data type(It stores homoogenous type of data
        // only)
        // It stores data in a continous manner
        // It is a physically as well as linearly both in linear
        // For example if we want to store data like name of the students, marks of
        // studnets, etc
        // if one studnet we can use primitive data type for storing this but storing
        // data in a sequence we need array

        // Method one of creating an array
        int[] marks = { 10, 20, 30, 40, 50 };

        // Method 2
        int[] marks1; // Declaring the array and stores the marks1 in a stack memory --> It is a compile time task
        marks1 = new int[5]; // Initalizating the array and creates a space for 5 element in heap memory, it
                             // is a reference of a marks1
                            //  It is a run time task
                            // And the memory allocating type is Dyanamic
                            // Dyanamic memory allocation means allocating memory in a runtime

        marks1[0] = 10; // By default value of the ineger array is 0, so overriding or giving intial
                        // value to the marks1[0] by using indexing
        marks1[2] = 20;

        System.out.println("Accessing the element of an array using index : " + marks1[0]);

        // We cam also declare array like this :
        // int[] marks1 = new int[5];

        // Example of String Array
        String[] name = { "Vansh", "Soham", "Suraj", "Tejas" };

        String[] email;
        email = new String[5];

        // By defalut value of a string is null

        // Loops with Array
        for (int i = 0; i < marks.length; i++) {
            // First Method
        }

        for (int elem : marks) {
            // Second method
        }

        for (int i = 0; i < 5; i++) {
            // Third method if the size of an array is konwn
        }

        // While loop
        int i = 0;
        while (i < marks.length) {
            // Script that u want to execute in a loop
            i++;
        }

        // 2D Array 
        // 3X3
        int[][] arrTwo = {
                { 10, 20, 30 }, 
                { 10, 20, 30 }, 
                { 10, 20, 30 }
        };

        int[][] arrTwo1;
        arrTwo1 = new int[2][2]; // Aray 2X2

        
        for(int row=0; row<arrTwo.length; i++){
            for(int col=0; col < arrTwo[row].length; col++){
                System.out.println(arrTwo[row][col]);
            }
        }


        ArrayList<Integer> list = new ArrayList<Integer>(10);
        // Generics : It tells what type of data is getting stored in a List
        
        // Main Advantage of array list is it is not of a fixed size, it is a dyanamic we can change the size of a list in runtime


        // Printing array using Arrays Class
        System.out.print(Arrays.toString(marks));

        // Printing 2d Array using Arrays class
        System.out.print(Arrays.deepToString(arrTwo));
        int[][] matrix = {
            {1, 2, 3}, {4, 5, 6}, {7, 8, 9}
        };
        for(int[] elem : matrix){
            System.out.print(Arrays.toString(elem));
        }

    }

}