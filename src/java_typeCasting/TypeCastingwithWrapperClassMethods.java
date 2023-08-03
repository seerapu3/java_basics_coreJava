package java_typeCasting;

public class TypeCastingwithWrapperClassMethods {
	
	public static void main(String[] args) {
		String strNumber = "123";
		int number = Integer.parseInt(strNumber); // Parsing a string to an int using parseInt method
		System.out.println("Parsed Integer: " + number);

		String strDouble = "3.14";
		double pi = Double.parseDouble(strDouble); // Parsing a string to a double using parseDouble method
		System.out.println("Parsed Double: " + pi);

	}
}
