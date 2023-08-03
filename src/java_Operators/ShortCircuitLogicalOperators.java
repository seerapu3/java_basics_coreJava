package java_Operators;
public class ShortCircuitLogicalOperators {
    public static void main(String[] args) {
        int a = 10, b = 0;
        if (b != 0 && a / b > 0) {
            System.out.println("a/b is positive");
        } else {
            System.out.println("a/b is either 0 or negative");
        }
    }
}
