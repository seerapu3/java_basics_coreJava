package java_PrecedenceOperators;
public class PrecedenceOfUnaryOperators {
    public static void main(String[] args) {
        int a = 5, b = 3;
        boolean result = a++ > b && ++b == 4;
        System.out.println("Result: " + result);
    }
}
