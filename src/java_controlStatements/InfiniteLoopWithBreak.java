package java_controlStatements;
public class InfiniteLoopWithBreak {
    public static void main(String[] args) {
        int count = 0;
        while (true) {
            System.out.print(count + " ");
            count++;
            if (count == 5) {
                break;
            }
        }
    }
}
