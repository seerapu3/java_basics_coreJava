package java_AbstractClassAndMethods;
abstract class Animal {
    String name;

    abstract void makeSound();
    abstract void eat();

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println(name + " says Woof!");
    }

    @Override
    void eat() {
        System.out.println(name + " is eating bones.");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println(name + " says Meow!");
    }

    @Override
    void eat() {
        System.out.println(name + " is eating fish.");
    }
}