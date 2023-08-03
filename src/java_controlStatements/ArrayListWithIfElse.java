package java_controlStatements;
import java.util.ArrayList;
import java.util.List;

public class ArrayListWithIfElse {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        for (int number : numbers) {
            if (number > 30) {
                System.out.println(number + " is greater than 30");
            } else {
                System.out.println(number + " is not greater than 30");
            }
        }
    }
}
