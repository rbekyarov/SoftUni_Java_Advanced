package ADV11DefiningClasses.P3BankAccount;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        BankAccount bankAccount = null;
        List<BankAccount> list = new ArrayList<>();
        while (!input.equals("End")) {
            String[] command = input.split(" ");
            if (command.length == 1) {
                bankAccount = new BankAccount();
                System.out.printf("Account ID%d created%n", bankAccount.getId());
                list.add(bankAccount);
            }
            if (command[0].equals("Deposit")) {
                int id = Integer.parseInt(command[1]);
                double amount = Double.parseDouble(command[2]);

                if (id - 1 < list.size() && id - 1 >= 0) {
                    list.get(id - 1).deposit(amount);
                    System.out.printf("Deposited %.0f to ID%d%n", amount, list.get(id - 1).getId());
                } else {
                    System.out.println("Account does not exist");
                }
            } else if (command[0].equals("SetInterest")) {
                double interest = Double.parseDouble(command[1]);
                bankAccount.setInterestRate(interest);

            } else if (command[0].equals("GetInterest")) {
                int id = Integer.parseInt(command[1]);
                int years = Integer.parseInt(command[2]);
                if (id - 1 < list.size() && id - 1 >= 0) {
                    System.out.printf("%.2f%n", list.get(id - 1).getInterest(years));
                } else {
                    System.out.println("Account does not exist");
                }
            }
            input = scanner.nextLine();
        }
    }
}
