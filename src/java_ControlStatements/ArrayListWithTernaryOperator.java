package java_ControlStatements;
import java.util.ArrayList;
import java.util.List;

public class ArrayListWithTernaryOperator {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        for (int number : numbers) {
            String result = (number > 30) ? "greater than 30" : "not greater than 30";
            System.out.println(number + " is " + result);
        }
    }
}
