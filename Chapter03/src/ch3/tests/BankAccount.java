package ch3.tests;

/**
 * A bank account that changes with deposits and withdrawls
 */
public class BankAccount {
    private double balance;

    /**
     * Constructs a bank account with a balnace of zero
     */
    public BankAccount() {
        balance = 0.0;
    }

    /**
     * Constructs a bank account with the initial balance provided
     */
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    /**
     * Deposits money into account
     * @param amount the amount deposited
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Withdraws money from account
     * @praram amount the amount withdrawn
     */
    public void withdraw(double amount) {
        balance -= amount;
    }

    /**
     * Gets current balance of account
     * @return the balance of account
     */
    public double getBalance() {
        return balance;
    }
}
