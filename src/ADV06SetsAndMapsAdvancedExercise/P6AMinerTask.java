package ADV06SetsAndMapsAdvancedExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P6AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> resources = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!resources.containsKey(input)) {
                resources.put(input, quantity);
            } else {
                int currentQuantity = resources.get(input);
                resources.put(input, currentQuantity + quantity);
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}
