package java_precedenceOperators;
class Animal {}
class Dog extends Animal {}

public class PrecedenceOfInstanceOfOperator {
    public static void main(String[] args) {
        Animal animal = new Dog();
       // boolean result = animal instanceof Dog && !(animal instanceof String);
      //  System.out.println("Result: " + result);
    }
}
