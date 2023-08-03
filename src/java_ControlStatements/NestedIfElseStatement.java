package java_ControlStatements;
public class NestedIfElseStatement {
    public static void main(String[] args) {
        int age = 25;
        if (age >= 18) {
            if (age >= 21) {
                System.out.println("You can drink and enter clubs.");
            } else {
                System.out.println("You can enter clubs but cannot drink.");
            }
        } else {
            System.out.println("You are underage.");
        }
    }
}
