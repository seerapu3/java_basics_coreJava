package java_ControlStatements;
public class NestedIfElseWithLogicalAnd {
    public static void main(String[] args) {
        int age = 35;
        boolean isEmployed = true;
        if (age >= 18 && age <= 65) {
            if (isEmployed) {
                System.out.println("You are eligible to vote and work.");
            } else {
                System.out.println("You are eligible to vote but not work.");
            }
        } else {
            System.out.println("You are not eligible to vote or work.");
        }
    }
}
