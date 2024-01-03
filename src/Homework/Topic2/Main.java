package Homework.Topic2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(10);

        User user1 = new User("John Doe", "Example Street, No. 123", "1234567890");
        BankAccount account1 = new BankAccount(1001, user1);

        User user2 = new User("Jane Smith", "Main Alley, No. 45", "0987654321");
        BankAccount account2 = new BankAccount(1002, user2);

        User user3 = new User("Alice Johnson", "Maple Avenue, No. 7", "4567890123");
        BankAccount account3 = new BankAccount(1003, user3);

        User user4 = new User("Bob Williams", "Oak Road, No. 15", "9876543210");
        BankAccount account4 = new BankAccount(1004, user4);

        User user5 = new User("Eve Anderson", "Pine Street, No. 99", "5432109876");
        BankAccount account5 = new BankAccount(1005, user5);

        account1.deposit(500);
        account2.deposit(1000);
        account3.deposit(750);
        account4.deposit(1200);
        account5.deposit(900);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.addAccount(account4);
        bank.addAccount(account5);

        bank.displayAllAccounts();

        int positiveOrZeroCount = bank.countAccountsPositiveOrZero();
        System.out.println("Number of accounts with positive or zero balance: " + positiveOrZeroCount);

        // Display balance for each account
        for (int i = 0; i < bank.getTotalAccounts(); i++) {
            System.out.println("Account " + bank.getAccount(i).getAccountNumber() + " balance: " + bank.getAccount(i).getBalance());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your CNP to access your account: ");
        String inputCNP = scanner.nextLine();

        BankAccount userAccount = bank.findAccountByCNP(inputCNP);
        if (userAccount != null) {
            System.out.println("Hello " + userAccount.getOwner().getName());
            System.out.println("Your account balance is: " + userAccount.getBalance());

            // Deposit operation
            System.out.print("Enter amount to deposit: ");
            double depositAmount = scanner.nextDouble();
            userAccount.deposit(depositAmount);
            System.out.println("New account balance: " + userAccount.getBalance());

            // Withdraw operation
            System.out.print("Enter amount to withdraw: ");
            double withdrawAmount = scanner.nextDouble();
            if (withdrawAmount <= userAccount.getBalance()) {
                userAccount.withdraw(withdrawAmount);
                System.out.println("New account balance: " + userAccount.getBalance());
            } else {
                System.out.println("Insufficient funds.");
            }

            // Transfer operation
            System.out.print("Enter amount to transfer: ");
            double transferAmount = scanner.nextDouble();
            if (transferAmount <= userAccount.getBalance()) {
                System.out.print("Enter CNP of recipient: ");
                String recipientCNP = scanner.next();
                BankAccount recipientAccount = bank.findAccountByCNP(recipientCNP);
                if (recipientAccount != null) {
                    userAccount.withdraw(transferAmount);
                    recipientAccount.deposit(transferAmount);
                    System.out.println("Transfer successful.");
                    System.out.println("Your new balance: " + userAccount.getBalance());
                } else {
                    System.out.println("Recipient account not found.");
                }
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("No account found with CNP " + inputCNP);
        }
    }
}
