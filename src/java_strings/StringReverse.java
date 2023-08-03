package java_strings;
public class StringReverse {
    public static void main(String[] args) {
        String str = "Hello, World!";
        StringBuilder reversedStr = new StringBuilder(str).reverse();
        System.out.println("Reversed: " + reversedStr);
    }
}
