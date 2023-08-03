package java_controlStatements;
public class ReturnExample {
    public static void main(String[] args) {
        int result = addNumbers(5, 10);
        System.out.println("Result: " + result);
    }
    
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        // If the sum is greater than 15, return 15 directly
        if (sum > 15) {
            return 15;
        }
        // Otherwise, return the actual sum
        return sum;
    }
}
