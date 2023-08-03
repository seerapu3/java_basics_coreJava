package java_ControlStatements;
public class SumOfArrayUsingForEach {
    // Calculate the sum of an array of numbers using a for-each loop:
	public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);
    }
}
