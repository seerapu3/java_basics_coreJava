package java_typeCasting;

public class TypeCastingwithWrapperClasses {
	
	public static void main(String[] args) {
		int num = 50;
		Integer wrapperInt = num; // Autoboxing - Implicit type casting from int to Integer
		System.out.println("Wrapper Integer: " + wrapperInt);

		double decimal = 3.14;
		Double wrapperDouble = decimal; // Autoboxing - Implicit type casting from double to Double
		System.out.println("Wrapper Double: " + wrapperDouble);

	}
}
