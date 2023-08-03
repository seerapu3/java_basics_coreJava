package java_ControlStatements;
import java.util.Scanner;
// Calculate the factorial of a number using a do-while loop:
public class FactorialUsingDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = input.nextInt();
        int factorial = 1;
        int i = 1;
        do {
            factorial *= i;
            i++;
        } while (i <= N);
        System.out.println("Factorial of " + N + " is: " + factorial);
    }
}
