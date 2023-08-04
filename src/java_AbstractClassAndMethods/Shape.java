package java_AbstractClassAndMethods;
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;
    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length;
    double width;
    
    @Override
    double area() {
        return length * width;
    }
}
