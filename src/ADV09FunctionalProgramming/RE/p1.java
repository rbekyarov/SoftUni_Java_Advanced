package ADV09FunctionalProgramming.RE;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<Integer> nums = e -> e % 2 == 0;

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt).filter(nums).collect(Collectors.toList());

        System.out.println(numbers.stream().map(String::valueOf).
                collect(Collectors.joining(", ")));

        System.out.println(numbers.stream().sorted().map(String::valueOf).
                collect(Collectors.joining(", ")));



    }
}
