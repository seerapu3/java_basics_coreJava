package java_controlStatements;
public class StringWithIfElse {
    public static void main(String[] args) {
        String fruit = "Apple";

        if (fruit.equals("Apple")) {
            System.out.println("It's an apple.");
        } else if (fruit.equals("Banana")) {
            System.out.println("It's a banana.");
        } else {
            System.out.println("It's an unknown fruit.");
        }
    }
}
