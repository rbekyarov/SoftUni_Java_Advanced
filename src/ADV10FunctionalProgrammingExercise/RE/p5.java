package ADV10FunctionalProgrammingExercise.RE;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class p5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Function<приема, връща> -> apply
        //Consumer<приема> -> void -> accept
        //Supplier<връща> -> get
        //Predicate<приема> -> връща true / false -> test
        //BiFunction<приема1, приема2, връща> -> apply
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList()); //{1, 2, 3, 4, 5, 6}
        int n = Integer.parseInt(scanner.nextLine());
        //reverse on list
        Collections.reverse(numbers); //{1, 2, 3, 4, 5, 6} -> {6, 5, 4, 3, 2, 1}

        //remove all numbers which are divisible on n
        //приема число -> true / false
        Predicate<Integer> checkDivision = number -> number % n == 0;
        numbers.removeIf(checkDivision);

        numbers.forEach(number -> System.out.print(number + " "));
    }
}