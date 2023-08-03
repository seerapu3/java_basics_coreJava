package java_ControlStatements;
public class NestedIfElse {
    public static void main(String[] args) {
        int age = 25;
        boolean hasLicense = true;

        if (age >= 18) {
            if (hasLicense) {
                System.out.println("You can drive.");
            } else {
                System.out.println("You can't drive without a license.");
            }
        } else {
            System.out.println("You are too young to drive.");
        }
    }
}
