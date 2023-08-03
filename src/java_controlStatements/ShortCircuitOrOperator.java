package java_controlStatements;
public class ShortCircuitOrOperator {
    public static void main(String[] args) {
        int a = 10, b = -5;
        if (a > 0 || b > 0) {
            System.out.println("At least one number is positive.");
        }
    }
}
