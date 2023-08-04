package java_AbstractClassAndMethods;
public class AnimalMain {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.name = "puppy";
        dog.makeSound();
        dog.eat();
        dog.sleep();

        System.out.println();

        Animal cat = new Cat();
        cat.name = "kulfi";
        cat.makeSound();
        cat.eat();
        cat.sleep();
    }
}
