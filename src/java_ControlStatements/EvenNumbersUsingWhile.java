package java_ControlStatements;
import java.util.Scanner;
// Print even numbers from 1 to N using a while loop:
public class EvenNumbersUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int N = input.nextInt();
        int i = 1;
        while (i <= N) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
