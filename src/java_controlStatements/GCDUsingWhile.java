package java_controlStatements;
import java.util.Scanner;
// Find the greatest common divisor (GCD) of two numbers using a while loop:
public class GCDUsingWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        System.out.println("GCD: " + num1);
    }
}
