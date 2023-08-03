package java_precedenceOperators;
public class PrecedenceOfParenthesesWithUnaryOperators {
    public static void main(String[] args) {
        int a = 5, b = 3;
        int result = (a++ + b) * (a - b);
        System.out.println("Result: " + result);
    }
}
