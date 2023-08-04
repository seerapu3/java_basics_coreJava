package java_AbstractClassAndMethods;
abstract class Employee {
    abstract double calculateSalary();
}

class FullTimeEmployee extends Employee {
    double monthlySalary;
    
    @Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    double hoursWorked;
    
    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
