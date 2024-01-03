package Homework.Topic2;

public class BankAccount {
    private int accountNumber;
    private User owner;
    private double balance;

    public BankAccount(int accountNumber, User owner) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = 0.0; // Initialize balance to zero
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public User getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void displayBalance() {
        System.out.println("Account " + accountNumber + " balance: " + balance);
    }
}
