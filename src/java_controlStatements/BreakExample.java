package java_controlStatements;
public class BreakExample {
    public static void main(String[] args) {
        // A simple loop to print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                // When i is equal to 6, break the loop
                break;
            }
            System.out.println(i);
        }
    }
}
