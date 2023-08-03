package java_controlStatements;
public class IfWithLogicalOr {
    public static void main(String[] args) {
        int age = 15;
        if (age < 13 || age > 19) {
            System.out.println("Not a teenager");
        } else {
            System.out.println("Teenager");
        }
    }
}
