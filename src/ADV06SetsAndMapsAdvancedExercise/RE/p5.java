package ADV06SetsAndMapsAdvancedExercise.RE;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, String> map = new HashMap<>();

        while (!input.equals("search")) {
            String[] inputLines = input.split("-");
            String name = inputLines[0];
            String phoneNum = inputLines[1];
            map.put(name, phoneNum);
            input = scanner.nextLine();
        }
        String searchName = scanner.nextLine();
        while (!searchName.equals("stop")) {
            if (map.containsKey(searchName)) {
                System.out.printf("%s -> %s\n", searchName, map.get(searchName));
            } else {
                System.out.println("Contact " + searchName + " does not exist.");
            }
            searchName = scanner.nextLine();
        }
    }
}