import java.util.Scanner;

public class PrintAllPrimeNumbers {
    public static Scanner sc = new Scanner(System.in);

    // Changed to return boolean: true if prime, false otherwise
    public static boolean isPrime(int num) {
        // 1 or less are not prime numbers
        if (num <= 1) {
            return false;
        }

        int divisorCount = 0;
        // Check all divisors from 1 up to the number itself
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisorCount++;
            }
        }

        // A prime number has EXACTLY 2 divisors (1 and itself)
        return divisorCount == 2;
    }

    public static void printingPrimeNumbers(int range) {
        for (int i = 1; i <= range; i++) {
            // Only print the number if it is actually prime
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter a range : ");
        int range = sc.nextInt();

        printingPrimeNumbers(range);
    }
}