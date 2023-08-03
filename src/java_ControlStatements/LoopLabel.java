package java_ControlStatements;
public class LoopLabel {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            innerLoop:
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break outerLoop;
                }
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
    }
}
