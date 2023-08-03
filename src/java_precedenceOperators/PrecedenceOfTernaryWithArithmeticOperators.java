package java_precedenceOperators;
public class PrecedenceOfTernaryWithArithmeticOperators {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2;
        int result = (a + b) > (a - c) ? a * b : a / c;
        System.out.println("Result: " + result);
    }
}
