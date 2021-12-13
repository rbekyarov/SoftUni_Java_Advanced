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

                System.out.println(nameSearch + " -> " + phoneBook.get(nameSearch));

            } else {
                System.out.printf("Contact %s does not exist.%n", nameSearch);
            }
            command = scanner.nextLine();
        }
    }
}
