package java_AbstractClassAndMethods;
abstract class Person {
    String name;
    
    abstract void introduce();
}

class Student extends Person {
    @Override
    void introduce() {
        System.out.println("Hi, I am a student. My name is " + name + ".");
    }
}

class Teacher extends Person {
    @Override
    void introduce() {
        System.out.println("Hello, I am a teacher. My name is " + name + ".");
    }
}
