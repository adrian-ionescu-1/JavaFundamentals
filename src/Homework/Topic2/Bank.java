package Homework.Topic2;

public class Bank {
    private BankAccount[] accounts;
    private int totalAccounts;

    public Bank(int maxAccounts) {
        accounts = new BankAccount[maxAccounts];
        totalAccounts = 0;
    }

    public void addAccount(BankAccount account) {
        if (totalAccounts < accounts.length) {
            accounts[totalAccounts] = account;
            totalAccounts++;
        } else {
            System.out.println("Cannot add more accounts. Maximum capacity reached.");
        }
    }

    public void displayAllAccounts() {
        System.out.println("List of bank accounts:");
        for (int i = 0; i < totalAccounts; i++) {
            System.out.println("Account " + accounts[i].getAccountNumber() + ", Owner: " + accounts[i].getOwner().getName());
        }
    }

    public int countAccountsPositiveOrZero() {
        int count = 0;
        for (int i = 0; i < totalAccounts; i++) {
            if (accounts[i].getBalance() >= 0) {
                count++;
            }
        }
        return count;
    }

    public int getTotalAccounts() {
        return totalAccounts;
    }

    public BankAccount getAccount(int index) {
        return accounts[index];
    }

    public BankAccount findAccountByCNP(String cnp) {
        for (int i = 0; i < totalAccounts; i++) {
            if (accounts[i].getOwner().getCNP().equals(cnp)) {
                return accounts[i];
            }
        }
        return null; // Return null if no account is found
    }
}
