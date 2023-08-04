package java_AbstractClassAndMethods;
public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount();
        savingsAccount.deposit(1000);
        savingsAccount.checkBalance();
        savingsAccount.withdraw(500);
        savingsAccount.checkBalance();

        System.out.println();

        BankAccount checkingAccount = new CheckingAccount();
        checkingAccount.deposit(2000);
        checkingAccount.checkBalance();
        checkingAccount.withdraw(2500);
        checkingAccount.checkBalance();
    }
}
