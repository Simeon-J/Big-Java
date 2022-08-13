package ch3.tests;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount John = new BankAccount();
        John.deposit(200.00);
        System.out.println("Expected: 200");
        System.out.println("The balance of John's account is: " + John.getBalance());
        John.withdraw(150.00);
        System.out.println("Expected: 50");
        System.out.println("The balance of John's account is: " + John.getBalance());

        BankAccount Mary = new BankAccount(500.00);
        Mary.deposit(200.00);
        System.out.println("Expected: 700");
        System.out.println("The balance of John's account is: " + Mary.getBalance());
        Mary.withdraw(300.00);
        System.out.println("Expected: 400");
        System.out.println("The balance of John's account is: " + Mary.getBalance());
    }
}
