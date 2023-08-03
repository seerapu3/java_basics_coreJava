package java_ControlStatements;
public class ContinueExample {
    public static void main(String[] args) {
        // A loop to print even numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                // Skip odd numbers and continue with the next iteration
                continue;
            }
            System.out.println(i);
        }
    }
}
