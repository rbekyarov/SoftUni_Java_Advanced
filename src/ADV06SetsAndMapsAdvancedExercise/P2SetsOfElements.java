package ADV06SetsAndMapsAdvancedExercise;


import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class P2SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int countSet1 = input[0];
        int countSet2 = input[1];

        LinkedHashSet<String> set1 = new LinkedHashSet<>();
        LinkedHashSet<String> set2 = new LinkedHashSet<>();

        fillSet(scanner, countSet1, set1);
        fillSet(scanner, countSet2, set2);

        set1.retainAll(set2);
        for (String element : set1) {
            System.out.print(element + " ");
        }
    }

    public static LinkedHashSet<String> fillSet(Scanner scanner, int countSet, LinkedHashSet<String> set) {
        for (int i = 0; i < countSet; i++) {
            String number = (scanner.nextLine());
            set.add(number);
        }
        return set;
    }
}
