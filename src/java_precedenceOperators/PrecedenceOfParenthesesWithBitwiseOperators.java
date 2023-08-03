package java_precedenceOperators;
public class PrecedenceOfParenthesesWithBitwiseOperators {
    public static void main(String[] args) {
        int a = 5, b = 3, c = 2;
        int result = (a & b) | (b ^ c);
        System.out.println("Result: " + result);
    }
}
