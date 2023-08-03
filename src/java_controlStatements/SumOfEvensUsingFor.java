package java_controlStatements;
import java.util.Scanner;
// Find the sum of even numbers from 1 to N using a for loop:
public class SumOfEvensUsingFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of even numbers from 1 to " + N + " is: " + sum);
    }
}
