package ADV11DefiningClasses.RE;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount bankAccount = null;
        String input = scanner.nextLine();
        Map<Integer, BankAccount> mapAccounts = new HashMap<>();
        while (!input.equals("end")) {


            if (input.split("\\s+")[0].equals("Create")) {
                bankAccount = new BankAccount();
                if (!mapAccounts.containsKey(bankAccount.getId())) {
                    mapAccounts.put(bankAccount.getId(), bankAccount);
                    System.out.printf("Account ID%d created%n", bankAccount.getId());
                }


            } else if (input.split("\\s+")[0].equals("Deposit")) {
                int id = Integer.parseInt(input.split("\\s+")[1]);
                double amount = Double.parseDouble(input.split("\\s+")[2]);
                if (mapAccounts.containsKey(id)) {
                    bankAccount = mapAccounts.get(id);
                    bankAccount.deposit(amount);
                    System.out.printf("Deposited %.0f to ID%d%n", amount, id);
                    mapAccounts.put(id, bankAccount);
                } else {
                    System.out.println("Account does not exist");
                }


            } else if (input.split("\\s+")[0].equals("SetInterest")) {
                double newInterestRate = Double.parseDouble(input.split("\\s+")[1]);
                BankAccount.setInterestRate(newInterestRate);


            } else if (input.split("\\s+")[0].equals("GetInterest")) {
                int id = Integer.parseInt(input.split("\\s+")[1]);
                int years = Integer.parseInt(input.split("\\s+")[2]);

                if (mapAccounts.containsKey(id)) {
                    bankAccount = mapAccounts.get(id);
                    bankAccount.getInterest(years);
                    System.out.printf("%.2f%n",bankAccount.getInterest(years));
                }else {
                    System.out.println("Account does not exist");
                }

            }

            input = scanner.nextLine();
        }
        System.out.println();
    }
}
