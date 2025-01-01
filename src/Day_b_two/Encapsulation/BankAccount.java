//Write a class BankAccount with private attributes for accountNumber and balance.
// Provide public methods to deposit, withdraw, and check the balance.
package Day_b_two.Encapsulation;

public class BankAccount {

    private String accountNumber;
    private double balance;


    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: $" + amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }


    public double getBalance() {
        return balance;
    }


    public static void main(String[] args) {

        BankAccount account = new BankAccount("123456789", 500.0);
        System.out.println("Initial Balance: $" + account.getBalance());
        account.deposit(200.0);
        System.out.println("Current Balance: $" + account.getBalance());
        account.withdraw(100.0);
        System.out.println("Current Balance: $" + account.getBalance());
        account.withdraw(700.0);
        System.out.println("Current Balance: $" + account.getBalance());
    }
}
