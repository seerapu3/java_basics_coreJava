package java_controlStatements;
public class StringWithSwitch {
    public static void main(String[] args) {
        String fruit = "Orange";

        switch (fruit) {
            case "Apple":
                System.out.println("It's an apple.");
                break;
            case "Banana":
                System.out.println("It's a banana.");
                break;
            default:
                System.out.println("It's an unknown fruit.");
                break;
        }
    }
}
