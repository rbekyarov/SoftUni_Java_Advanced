package ADV05SetsAndMapsAdvanced;

import java.util.*;

public class p3VoinaNumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Integer> firstPlayerCards = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondPlayerCards = new LinkedHashSet<>();

        int[] arr1 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(scanner.nextLine()
                .split(" ")).mapToInt(Integer::parseInt).toArray();

        fillSet(firstPlayerCards, arr1);
        fillSet(secondPlayerCards, arr2);

        int round = 50;

        while (round-- > 0 && !firstPlayerCards.isEmpty() && !secondPlayerCards.isEmpty()) {
            int firstPlayerCard = getFirstElementFromSet(firstPlayerCards);
            int secondPlayerCard = getFirstElementFromSet(secondPlayerCards);
            if (firstPlayerCard > secondPlayerCard) {

                firstPlayerCards.add(firstPlayerCard);
                firstPlayerCards.add(secondPlayerCard);
                firstPlayerCards.remove(firstPlayerCard);
                secondPlayerCards.remove(secondPlayerCard);
            } else if (firstPlayerCard < secondPlayerCard) {

                secondPlayerCards.add(firstPlayerCard);
                secondPlayerCards.add(secondPlayerCard);
                firstPlayerCards.remove(firstPlayerCard);
                secondPlayerCards.remove(secondPlayerCard);
            }
        }
        if (firstPlayerCards.size() > secondPlayerCards.size()) {
            System.out.println("First player win!");
        } else if (firstPlayerCards.size() < secondPlayerCards.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }

    private static int getFirstElementFromSet(LinkedHashSet<Integer> playerCards) {
        for (int cards : playerCards) {
            return cards;

        }
        return 0;
    }

    private static Set<Integer> fillSet(LinkedHashSet<Integer> set, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return set;
    }
}
