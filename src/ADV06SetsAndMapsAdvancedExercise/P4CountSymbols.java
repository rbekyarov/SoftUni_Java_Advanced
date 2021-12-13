package ADV06SetsAndMapsAdvancedExercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P4CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Character, Integer> symbolsMap = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (!symbolsMap.containsKey(currentSymbol)) {
                symbolsMap.put(currentSymbol, 1);
            } else {
                int currentValue = symbolsMap.get(currentSymbol);
                symbolsMap.put(currentSymbol, ++currentValue);
            }
        }
        for (Map.Entry<Character, Integer> entry : symbolsMap.entrySet()) {
            System.out.printf("%s: %d time/s%n",entry.getKey(),entry.getValue());
        }

    }
}
