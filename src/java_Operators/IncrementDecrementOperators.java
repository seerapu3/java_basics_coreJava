package java_Operators;
public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Original a: " + a);
        System.out.println("Post-increment a: " + (a++));
        System.out.println("After post-increment a: " + a);
        System.out.println("Pre-increment a: " + (++a));
        System.out.println("After pre-increment a: " + a);
        System.out.println("Post-decrement a: " + (a--));
        System.out.println("After post-decrement a: " + a);
        System.out.println("Pre-decrement a: " + (--a));
        System.out.println("After pre-decrement a: " + a);
    }
}
