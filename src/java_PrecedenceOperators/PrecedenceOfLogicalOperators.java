package java_PrecedenceOperators;
public class PrecedenceOfLogicalOperators {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2;
        boolean result = a > b && a <= c || a != c;
        System.out.println("Result: " + result);
    }
}
