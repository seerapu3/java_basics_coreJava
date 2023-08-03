package java_PrecedenceOperators;
public class PrecedenceOfLogicalAndOrOperators {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2;
        boolean result = a > b && b < c || a == b;
        System.out.println("Result: " + result);
    }
}
