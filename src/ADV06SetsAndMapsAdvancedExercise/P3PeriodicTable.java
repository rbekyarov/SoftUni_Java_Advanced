package ADV06SetsAndMapsAdvancedExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class P3PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLine = Integer.parseInt(scanner.nextLine());
        TreeSet<String> chemicalCompounds = new TreeSet<>();
        for (int line = 0; line < countLine; line++) {
            String[] currentChemicals = scanner.nextLine().split(" ");
            chemicalCompounds.addAll(Arrays.asList(currentChemicals));
        }
        chemicalCompounds.forEach(e -> {
            System.out.print(e + " ");
        });
    }
}
