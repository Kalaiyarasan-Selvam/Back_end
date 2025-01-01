//Implement a simple banking system where users can open accounts, deposit money,
// withdraw money, and check balance using OOP

package Day_b_two.Additional_challenges;

import java.util.HashMap;

class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(int accountNumber, String accountHolderName, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialDeposit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void checkBalance() {
        System.out.println("Account Balance: $" + balance);
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }
}

class BankingSystem {
    private HashMap<Integer, Account> accounts = new HashMap<>();
    private int nextAccountNumber = 1001; // Starting account number

    public void openAccount(String accountHolderName, double initialDeposit) {
        Account newAccount = new Account(nextAccountNumber, accountHolderName, initialDeposit);
        accounts.put(nextAccountNumber, newAccount);
        System.out.println("Account created successfully! Your account number is: " + nextAccountNumber);
        nextAccountNumber++;
    }

    private Account getAccount(int accountNumber) {
        return accounts.get(accountNumber);
    }

    public void deposit(int accountNumber, double amount) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void withdraw(int accountNumber, double amount) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public void checkBalance(int accountNumber) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            account.checkBalance();
        } else {
            System.out.println("Account not found.");
        }
    }

    public void displayAccountDetails(int accountNumber) {
        Account account = getAccount(accountNumber);
        if (account != null) {
            account.displayDetails();
        } else {
            System.out.println("Account not found.");
        }
    }
}

public class BankingApplication {
    public static void main(String[] args) {
        BankingSystem bankingSystem = new BankingSystem();

        bankingSystem.openAccount("Alice", 500);
        bankingSystem.openAccount("Bob", 1000);

        bankingSystem.deposit(1001, 300);
        bankingSystem.withdraw(1002, 200);
        bankingSystem.checkBalance(1001);
        bankingSystem.displayAccountDetails(1002);
    }
}
