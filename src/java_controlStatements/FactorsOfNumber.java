package java_controlStatements;
import java.util.Scanner;
//Print the factors of a number using a for loop:
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = input.nextInt();
        System.out.print("Factors of " + N + ": ");
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
