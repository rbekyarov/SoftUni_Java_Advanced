package ADV10FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class p6PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Predicate<String> isNotValid = e -> e.toCharArray().length > n;
        names.removeIf(isNotValid);

        Consumer<List<String>> printNames = list -> list.forEach(e -> System.out.println(e + " "));

        printNames.accept(names);
    }
}
