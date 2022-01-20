package ADV06SetsAndMapsAdvancedExercise.RE;

import java.util.*;


public class p8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, Set<String>> cardMap = new LinkedHashMap<>();
        Map<String, Integer> tableValue = new HashMap<>();
        while (!input.equals("JOKER")) {

            String[] arr = input.split(": ");
            String namePlayer = arr[0];
            String cards = arr[1];
            String[] cardsArr = cards.split(", ");

            if (!cardMap.containsKey(namePlayer)) {
                cardMap.put(namePlayer, new LinkedHashSet<>());
            }
            cardMap.get(namePlayer).addAll(Arrays.stream(cardsArr).toList());
            input = scanner.nextLine();
        }
        tableValue.put("2", 2);
        tableValue.put("3", 3);
        tableValue.put("4", 4);
        tableValue.put("5", 5);
        tableValue.put("6", 6);
        tableValue.put("7", 7);
        tableValue.put("8", 8);
        tableValue.put("9", 9);
        tableValue.put("J", 11);
        tableValue.put("Q", 12);
        tableValue.put("K", 13);
        tableValue.put("A", 14);
        tableValue.put("S", 4);
        tableValue.put("H", 3);
        tableValue.put("D", 2);
        tableValue.put("C", 1);

        for (Map.Entry<String, Set<String>> entry : cardMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + getSumCards(entry.getValue(), tableValue));
        }
    }

    private static int getSumCards(Set<String> valueSet, Map<String, Integer> tableValue) {
        int sum = 0;
        for (String values : valueSet) {
            String[] valuesArr = values.split("");// "1" "0" "C"
            String key = valuesArr[0];
            String value = valuesArr[1];
            if (key.equals("1")) {
                value = valuesArr[2];
                sum += 10 * tableValue.get(value);
            } else {
                sum += tableValue.get(key) * tableValue.get(value);
            }
        }
        return sum;
    }
}
