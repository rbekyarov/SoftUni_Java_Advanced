package ADV10FunctionalProgrammingExercise.RE;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class p6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Function<приема, връща> -> apply
        //Consumer<приема> -> void -> accept
        //Supplier<връща> -> get
        //Predicate<приема> -> връща true / false -> test
        //BiFunction<приема1, приема2, връща> -> apply
        int n = Integer.parseInt(scanner.nextLine()); //дължина за сравнение
        String[] names = scanner.nextLine().split("\\s+"); // "Sara Sam George Mark John".split("\\s+") -> ["", "", "", "", ""]

        //name -> true(length <= n) / false (length > n)
        Predicate<String> checkValidLength = name -> name.length() <= n;
        //остават само отговарящите на условието
        Arrays.stream(names).filter(checkValidLength).forEach(System.out::println);
        //true -> оставя елемента в списъка
        //false -> маха елемента от списъка
    }
}