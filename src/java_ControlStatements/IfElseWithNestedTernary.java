package java_ControlStatements;
public class IfElseWithNestedTernary {
    public static void main(String[] args) {
        int number = 10;
        String result = (number % 2 == 0) ? "Even" : ((number > 0) ? "Positive" : "Negative");
        System.out.println("Number is " + result);
    }
}
