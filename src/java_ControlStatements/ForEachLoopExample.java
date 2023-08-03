package java_ControlStatements;
public class ForEachLoopExample {
	//Print numbers from 1 to 10 using a for-each loop:
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
