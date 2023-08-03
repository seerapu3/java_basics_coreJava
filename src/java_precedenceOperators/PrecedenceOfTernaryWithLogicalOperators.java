package java_precedenceOperators;
public class PrecedenceOfTernaryWithLogicalOperators {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2;
        boolean result = (a > b && b < c) ? true : false;
        System.out.println("Result: " + result);
    }
}
