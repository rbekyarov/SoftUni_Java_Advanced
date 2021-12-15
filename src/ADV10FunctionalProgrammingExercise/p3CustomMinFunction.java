package ADV10FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class p3CustomMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Function<int[],Integer> findSmallest = e -> Arrays.stream(e).min().getAsInt();
        System.out.println(findSmallest.apply(numbers));
    }
}
