package ch3.reinforcements;

/**
 * A bank account that changes with deposits and withdraws
 */
public class BankAccountMod {
    private double balance;
    private int freeTrans;
    private int fees;
    private final double FEE = 1.00;

    /**
     * Constructs a bank account with a balance of zero
     */
    public BankAccountMod() {
        balance = 0.0;
    }

    /**
     * Constructs a bank account with the initial balance provided
     */
    public BankAccountMod(double initialBalance) {
        balance = initialBalance;
        freeTrans = 5;
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
        if (freeTrans > 0) {
            freeTrans--;
        } else {
            balance -= amount;
            fees++;
        }
    }

    /**
     * Gets current balance of account
     * @return the balance of account
     */
    public double getBalance() {
        return balance;
    }

    public void deduction() {
        balance -= fees * FEE;
    }

    public double getFees() {
        return fees * FEE;
    }
}
