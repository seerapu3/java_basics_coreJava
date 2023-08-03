package java_strings;
import java.util.StringJoiner;

public class StringJoining {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ");
        joiner.add("Apple");
        joiner.add("Orange");
        joiner.add("Banana");
        String fruits = joiner.toString();
        System.out.println(fruits);
    }
}
