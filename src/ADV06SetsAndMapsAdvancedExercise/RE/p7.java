package ADV06SetsAndMapsAdvancedExercise.RE;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class p7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String name = "";
        Map<String, String> map = new LinkedHashMap<>();
        while (!input.equals("stop")) {
            name = input;
            String mail = scanner.nextLine();

            if (!mail.contains(".us") && !mail.contains(".uk") && !mail.contains(".com")) {
                map.put(name, mail);
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
