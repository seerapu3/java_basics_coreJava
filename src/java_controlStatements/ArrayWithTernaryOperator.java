package java_controlStatements;
public class ArrayWithTernaryOperator {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int number : numbers) {
            String result = (number > 30) ? "greater than 30" : "not greater than 30";
            System.out.println(number + " is " + result);
        }
    }
}
