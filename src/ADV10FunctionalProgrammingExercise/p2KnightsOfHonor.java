package ADV10FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class p2KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] knights = scanner.nextLine().split("\\s+");

        Consumer<String> printElementArr = e -> System.out.println("Sir "+e);

        Arrays.stream(knights).forEach(e -> printElementArr.accept(e));
    }
}
