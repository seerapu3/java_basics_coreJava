package java_dataTypes;
public class ClassAndObjectDataType {
    public static void main(String[] args) {
        PersonX PersonX = new PersonX("Alice", 25);
        System.out.println("PersonX: " + PersonX.getName() + ", Age: " + PersonX.getAge());
    }
}

class PersonX {
    private String name;
    private int age;

    public PersonX(String name, int age) {
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
