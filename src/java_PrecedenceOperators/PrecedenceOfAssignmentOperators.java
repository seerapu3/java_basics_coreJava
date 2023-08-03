package java_PrecedenceOperators;
public class PrecedenceOfAssignmentOperators {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2;
        a += b * c;
        System.out.println("a: " + a);
    }
}
