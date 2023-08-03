package java_controlStatements;
import java.util.Scanner;
//Sum of Numbers from 1 to N using a for loop:
public class SumUsingForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        System.out.println("Sum from 1 to " + N + " is: " + sum);
    }
}
