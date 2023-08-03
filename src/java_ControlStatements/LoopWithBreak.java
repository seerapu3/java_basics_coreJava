package java_ControlStatements;
public class LoopWithBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.print(i + " ");
        }
    }
}
