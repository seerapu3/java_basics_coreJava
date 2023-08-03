package java_ControlStatements;
public class LabeledBreakStatement {
    public static void main(String[] args) {
        outerLoop: for (int i = 1; i <= 5; i++) {
            innerLoop: for (int j = 1; j <= 5; j++) {
                if (i == 3 && j == 3) {
                    break outerLoop;
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
