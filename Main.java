package Sample;
//Comprehensive Assignment Q1
class Account {
    protected double balance;
    protected double interest;

    public Account(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
    }

    public void calculateInterest() {
        double calculatedInterest = balance * interest / 100;
        balance += calculatedInterest;
        System.out.println("Interest calculated and added to the account: " + calculatedInterest);
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    private double minBalance;

    public SavingsAccount(double balance, double interest, double minBalance) {
        super(balance, interest);
        this.minBalance = minBalance;
    }

    // Override the calculateInterest method for SavingsAccount
    @Override
    public void calculateInterest() {
        // Additional logic for calculating interest in a savings account
        double calculatedInterest = (balance - minBalance) * interest / 100;
        balance += calculatedInterest;
        System.out.println("Interest calculated and added to the Savings account: " + calculatedInterest);
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(double balance, double interest, double overdraftLimit) {
        super(balance, interest);
        this.overdraftLimit = overdraftLimit;
    }

    // Override the calculateInterest method for CurrentAccount
    @Override
    public void calculateInterest() {
        // Additional logic for calculating interest in a current account
        double calculatedInterest = (balance < 0) ? balance * interest / 100 : 0;
        balance += calculatedInterest;
        System.out.println("Interest calculated and added to the Current account: " + calculatedInterest);
    }
}

public class Main {
    public static void main(String[] args) {
        // Example usage of the classes
        SavingsAccount savingsAccount = new SavingsAccount(3500, 4, 2000);
        CurrentAccount currentAccount = new CurrentAccount(300, 3, 100);

        savingsAccount.displayBalance();
        savingsAccount.calculateInterest();
        savingsAccount.displayBalance();

        System.out.println();

        currentAccount.displayBalance();
        currentAccount.calculateInterest();
        currentAccount.displayBalance();
    }
}

