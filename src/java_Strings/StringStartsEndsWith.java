package java_Strings;
public class StringStartsEndsWith {
    public static void main(String[] args) {
        String str = "Hello, World!";
        boolean startsWithHello = str.startsWith("Hello");
        boolean endsWithWorld = str.endsWith("World");
        System.out.println("Starts with 'Hello': " + startsWithHello);
        System.out.println("Ends with 'World': " + endsWithWorld);
    }
}
