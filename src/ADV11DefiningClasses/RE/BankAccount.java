package ADV11DefiningClasses.RE;

public class BankAccount {

    private int id;
    private double balance;
    private static double interestRate = 0.02;
    private static int counter = 0;

    public BankAccount() {

        counter++;
        this.id = counter;
        this.balance = 0;
    }

    public double deposit(double money) {
        return this.balance += money;

    }

    public double getInterest(int years) {
        return this.balance * years * interestRate;

    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }
}
