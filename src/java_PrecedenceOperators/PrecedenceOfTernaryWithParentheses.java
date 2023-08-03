package java_PrecedenceOperators;
public class PrecedenceOfTernaryWithParentheses {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2;
        int result = a > (b > c ? b : c) ? a : (b > c ? b : c);
        System.out.println("Result: " + result);
    }
}
