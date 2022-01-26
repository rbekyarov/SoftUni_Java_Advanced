package ADV10FunctionalProgrammingExercise.RE;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class p7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Function<приема, връща> -> apply
        //Consumer<приема> -> void -> accept
        //Supplier<връща> -> get
        //Predicate<приема> -> връща true / false -> test
        //BiFunction<приема1, приема2, връща> -> apply
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        //начин 1
        //лист -> отпечатаме индекса на най-малкия елемент

        //начин 2
        //лист -> върна индекса на най-малкия елемент
        //indexOf -> връща първия индекс, на който срещаме елемента
        //lastIndexOf -> връща последния индекс, на който срещаме елемента
        Function<List<Integer>, Integer> getIndexOfMinElement = list -> list.lastIndexOf(Collections.min(list));
        System.out.println(getIndexOfMinElement.apply(numbers));
    }
}