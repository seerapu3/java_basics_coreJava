package java_ControlStatements;
public class LoopWithTernaryOperator {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            String result = (i % 2 == 0) ? "Even" : "Odd";
            System.out.println(i + " is " + result);
        }
    }
}
