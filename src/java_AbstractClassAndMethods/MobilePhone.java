package java_AbstractClassAndMethods;
abstract class MobilePhone {
    abstract void call(String number);
    
    void text(String number, String message) {
        System.out.println("Sending text to " + number + ": " + message);
    }
}

class AndroidPhone extends MobilePhone {
    @Override
    void call(String number) {
        System.out.println("Calling " + number + " from Android phone.");
    }
}

class IPhone extends MobilePhone {
    @Override
    void call(String number) {
        System.out.println("Calling " + number + " from iPhone.");
    }
}
