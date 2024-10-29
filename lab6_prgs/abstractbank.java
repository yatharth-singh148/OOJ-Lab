// Abstract class representing a bank
abstract class Bank {
    protected String customerName;
    protected String accountNumber;
    protected double balance;

    public Bank(String customerName, String accountNumber, double initialDeposit) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
    }

    public abstract void deposit(double amount);
    public abstract void displayBalance();
    public abstract void withdraw(double amount);
}

abstract class Account extends Bank {
    public Account(String customerName, String accountNumber, double initialDeposit) {
        super(customerName, accountNumber, initialDeposit);
    }

    public abstract void computeAndDepositInterest();
}

class SavAcct extends Account {
    private double interestRate;

    public SavAcct(String customerName, String accountNumber, double initialDeposit, double interestRate) {
        super(customerName, accountNumber, initialDeposit);
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    @Override
    public void displayBalance() {
        System.out.println("Savings Account Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
        }
    }

    @Override
    public void computeAndDepositInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest deposited: " + interest + ", New Balance: " + balance);
    }
}

class CurAcct extends Account {
    private double minimumBalance;
    private double serviceCharge;

    public CurAcct(String customerName, String accountNumber, double initialDeposit, double minimumBalance, double serviceCharge) {
        super(customerName, accountNumber, initialDeposit);
        this.minimumBalance = minimumBalance;
        this.serviceCharge = serviceCharge;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    @Override
    public void displayBalance() {
        System.out.println("Current Account Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", New Balance: " + balance);
            checkMinimumBalance();
        }
    }

    private void checkMinimumBalance() {
        if (balance < minimumBalance) {
            balance -= serviceCharge;
            System.out.println("Minimum balance not maintained. Service charge imposed: " + serviceCharge);
            System.out.println("New Balance: " + balance);
        }
    }

    @Override
    public void computeAndDepositInterest() {
        System.out.println("Current account does not earn interest.");
    }
}

public class BankSystem {
    public static void main(String[] args) {
        SavAcct savingsAccount = new SavAcct("John Doe", "S001", 1000, 5);
        savingsAccount.displayBalance();
        savingsAccount.computeAndDepositInterest();
        savingsAccount.withdraw(200);
        savingsAccount.displayBalance();
        CurAcct currentAccount = new CurAcct("Jane Doe", "C001", 500, 300, 50);
        currentAccount.displayBalance();
        currentAccount.withdraw(250);
        currentAccount.displayBalance();
        currentAccount.withdraw(250);
        currentAccount.displayBalance();
    }
}
