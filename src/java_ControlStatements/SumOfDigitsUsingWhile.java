package java_ControlStatements;
import java.util.Scanner;
// Find the sum of digits of a number using a while loop:
public class SumOfDigitsUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = input.nextInt();
        int sum = 0;
        while (N != 0) {
            sum += N % 10;
            N /= 10;
        }
        System.out.println("Sum of digits is: " + sum);
    }
}
