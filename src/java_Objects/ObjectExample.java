package java_Objects;

class Person {
    String name;
    int age;

    void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

public class ObjectExample {
    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person1 = new Person();
        person1.name = "Prasad";
        person1.age = 39;

        // Calling the sayHello() method on the object
        person1.sayHello();
    }
}
