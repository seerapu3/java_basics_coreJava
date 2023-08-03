package java_Strings;
public class StringFormatting {
    public static void main(String[] args) {
        int age = 25;
        double height = 1.75;
        String name = "John";
        String formattedString = String.format("Name: %s, Age: %d, Height: %.2f", name, age, height);
        System.out.println(formattedString);
    }
}
