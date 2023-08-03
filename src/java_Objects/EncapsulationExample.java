package java_Objects;
class Student {
    private String name;
    private int age;

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Student student1 = new Student();

        // Using setters to set student information
        student1.setName("Alice");
        student1.setAge(20);

        // Using getters to retrieve student information
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
    }
}
