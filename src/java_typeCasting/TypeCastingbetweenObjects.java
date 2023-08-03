package java_typeCasting;

public class TypeCastingbetweenObjects {
	
	public static void main(String[] args) {
		class Animal {
		    void sound() {
		        System.out.println("Animal makes a sound.");
		    }
		}

		class Dog extends Animal {
		    void sound() {
		        System.out.println("Dog barks.");
		    }
		}

		//public class TypeCastingExample
		class TypeCastingExample {
		    public static void main(String[] args) {
		        Animal animal = new Dog();
		        animal.sound(); // Output: Dog barks.

		        // Explicit type casting to access Dog's method
		        Dog dog = (Dog) animal;
		        dog.sound(); // Output: Dog barks.
		    }
		}


	}
}
