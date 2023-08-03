package java_ControlStatements;
import java.util.Scanner;
// Reverse a number using a while loop:
public class ReverseNumberUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = input.nextInt();
        int reversed = 0;
        while (N != 0) {
            int digit = N % 10;
            reversed = reversed * 10 + digit;
            N /= 10;
        }
        System.out.println("Reversed number: " + reversed);
    }
}
