package ADV11DefiningClasses.P3BankAccount;

public class BankAccount {
    private final static double def_int_rate = 0.2;
    private static double InteresetRate = def_int_rate;
    private static int BankAccountCount = 1;
    private int id;
    private double balance;


    public BankAccount() {
        this.id = BankAccountCount++;
    }

    public static void setInterestRate(double int_rate) {
        BankAccount.InteresetRate = int_rate;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public int getId() {
        return id;
    }

    public double getInterest(int years) {
        return BankAccount.InteresetRate * years * this.balance;

    }
}
