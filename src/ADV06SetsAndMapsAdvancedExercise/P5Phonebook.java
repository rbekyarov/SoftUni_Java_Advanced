package ADV06SetsAndMapsAdvancedExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P5Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> phoneBook = new HashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("search")) {
            String[] data = input.split("-");
            String name = data[0];
            String number = data[1];

            phoneBook.put(name, number);

            input = scanner.nextLine();
        }
        String command = scanner.nextLine();
        while (!command.equals("stop")) {
            String nameSearch = command;
            if (phoneBook.containsKey(nameSearch)) {
                for (Map.Entry<String, String> entry : phoneBook.entrySet()) {

                }

                phoneBook.forEach((k, v) -> {
                    System.out.println(k + " -> " + v);
                });
            } else {
                System.out.println("Contact simo does not exist.");
            }
            command = scanner.nextLine();
        }
    }
}
