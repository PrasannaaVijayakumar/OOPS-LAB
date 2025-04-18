/*Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount. 
The bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances. 
SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods. */
import java.util.ArrayList;
import java.util.List;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}

class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    public SavingsAccount(double initialDeposit, double interestRate) {
        this.balance = initialDeposit;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void applyInterest() {
        balance += balance * interestRate / 100;
    }
}

class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double initialDeposit, double overdraftLimit) {
        this.balance = initialDeposit;
        this.overdraftLimit = overdraftLimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
}

class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }

    public void printAccountBalances() {
        for (Account account : accounts) {
            System.out.println("Account balance: " + account.getBalance());
        }
    }
}

public class interface_2 {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount savingsAccount = new SavingsAccount(1000.0, 1.25);
        System.out.println("Savings Account:\nInitial Deposit: $1000.00\nInterest rate: 1.25%");

        CurrentAccount currentAccount = new CurrentAccount(5000.0, 1000.0);
        System.out.println("\nCurrent Account:\nInitial Deposit: $5000.00\nOverdraft Limit: $1000.00");

        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        System.out.println("\nNow deposit $100 to Savings Account.");
        bank.deposit(savingsAccount, 100.0);
        System.out.println("Now deposit $500 to Current Account.");
        bank.deposit(currentAccount, 500.0);

        System.out.println("Withdraw $150 from Savings Account.\n");
        bank.withdraw(savingsAccount, 150.0);

        System.out.println("\nSavings A/c and Current A/c:");
        bank.printAccountBalances();

        savingsAccount.applyInterest();
        System.out.println("\nAfter applying interest on Savings A/c for 1 year:");
        System.out.println("Savings A/c and Current A/c:");
        bank.printAccountBalances();
    }
}