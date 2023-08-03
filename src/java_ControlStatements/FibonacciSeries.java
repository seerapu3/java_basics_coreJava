package java_ControlStatements;
import java.util.Scanner;
//Print the Fibonacci series up to N terms using a for loop:
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int N = input.nextInt();
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: " + first + " " + second + " ");
        for (int i = 2; i < N; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}
