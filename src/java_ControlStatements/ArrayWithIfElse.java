package java_ControlStatements;
public class ArrayWithIfElse {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        for (int number : numbers) {
            if (number > 30) {
                System.out.println(number + " is greater than 30");
            } else {
                System.out.println(number + " is not greater than 30");
            }
        }
    }
}
