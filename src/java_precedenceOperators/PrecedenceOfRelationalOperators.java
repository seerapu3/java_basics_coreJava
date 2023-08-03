package java_precedenceOperators;
public class PrecedenceOfRelationalOperators {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2;
        boolean result = a > b || a <= c;
        System.out.println("Result: " + result);
    }
}
