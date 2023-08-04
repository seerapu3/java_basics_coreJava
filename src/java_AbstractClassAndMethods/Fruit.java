package java_AbstractClassAndMethods;
abstract class Fruit {
    abstract void taste();
}

class Apple extends Fruit {
    @Override
    void taste() {
        System.out.println("The apple tastes sweet and slightly tart.");
    }
}

class Orange extends Fruit {
    @Override
    void taste() {
        System.out.println("The orange tastes tangy and juicy.");
    }
}
