package java_Strings;
public class StringConversion {
    public static void main(String[] args) {
        int number = 42;
        double pi = 3.14159;
        String numberStr = String.valueOf(number);
        String piStr = String.valueOf(pi);
        System.out.println("Number as String: " + numberStr);
        System.out.println("Pi as String: " + piStr);
    }
}
