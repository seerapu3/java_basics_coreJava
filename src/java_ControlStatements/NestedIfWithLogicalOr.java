package java_ControlStatements;
public class NestedIfWithLogicalOr {
    public static void main(String[] args) {
        int age = 25;
        if ((age >= 18 && age <= 21) || (age > 21 && age < 25)) {
            System.out.println("Young adult");
        } else {
            System.out.println("Not a young adult");
        }
    }
}
