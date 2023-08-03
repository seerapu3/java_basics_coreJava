package java_dataTypes;
public class ClassDataType {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);
        System.out.println("Person: " + person.getName() + ", Age: " + person.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
