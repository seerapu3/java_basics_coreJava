package java_operators;
class Animal {}
class Dog extends Animal {}

public class InstanceOfOperator {
    public static void main(String[] args) {
        Animal animal = new Dog();
        System.out.println(animal instanceof Animal);
        System.out.println(animal instanceof Dog);
    }
}
