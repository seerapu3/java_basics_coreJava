package java_ControlStatements;
public class TernaryOperatorWithMultipleConditions {
    public static void main(String[] args) {
        int num1 = 10, num2 = 5;
        String result = (num1 > num2) ? "Num1 is greater" : (num1 < num2) ? "Num2 is greater" : "Both are equal";
        System.out.println(result);
    }
}
