package java_AbstractClassAndMethods;
abstract class BankAccount {
    protected double balance;

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }
}
class SavingsAccount extends BankAccount {
    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("$" + amount + " deposited to Savings Account.");
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn from Savings Account.");
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }
}

class CheckingAccount extends BankAccount {
    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("$" + amount + " deposited to Checking Account.");
    }

    @Override
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn from Checking Account.");
        } else {
            System.out.println("Insufficient balance in Checking Account.");
        }
    }
}