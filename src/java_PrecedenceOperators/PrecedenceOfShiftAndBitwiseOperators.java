package java_PrecedenceOperators;
public class PrecedenceOfShiftAndBitwiseOperators {
    public static void main(String[] args) {
        int a = 5, b = 3, c = 2;
        int result = (a << b) & c;
        System.out.println("Result: " + result);
    }
}
