package java_controlStatements;
import java.util.Scanner;
// Print the ASCII values of characters in a string using a for loop:
public class AsciiValuesOfString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int asciiValue = (int) ch;
            System.out.println(ch + " - " + asciiValue);
        }
    }
}
