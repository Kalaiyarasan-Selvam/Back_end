//Write a program with a class Account
// that has overloaded constructors to initialize accountNumber and balance in different ways.

package Day_b_two.constructors;

class Account {

    private int accountNumber;
    private double balance;


    public Account() {
        this.accountNumber = 0;
        this.balance = 0.0;
    }

    public Account(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {

        Account account1 = new Account();
        System.out.println("Default Constructor:");
        account1.displayDetails();

        Account account2 = new Account(12345);
        System.out.println("\nConstructor with Account Number:");
        account2.displayDetails();

        Account account3 = new Account(67890, 1000.50);
        System.out.println("\nConstructor with Account Number and Balance:");
        account3.displayDetails();
    }
}
