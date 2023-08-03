package java_strings;
public class StringToNumbers {
    public static void main(String[] args) {
        String numberStr = "42";
        String doubleStr = "3.14159";
        int number = Integer.parseInt(numberStr);
        double pi = Double.parseDouble(doubleStr);
        System.out.println("Number: " + number);
        System.out.println("Pi: " + pi);
    }
}
