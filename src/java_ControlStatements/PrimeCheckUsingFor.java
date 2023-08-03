package java_ControlStatements;
import java.util.Scanner;
// Check if a number is prime using a for loop:
public class PrimeCheckUsingFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = input.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(N + " is a prime number.");
        } else {
            System.out.println(N + " is not a prime number.");
        }
    }
}
