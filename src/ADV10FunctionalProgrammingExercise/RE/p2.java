package ADV10FunctionalProgrammingExercise.RE;


import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Function<приема, връща> -> apply
        //Consumer<приема> -> void -> accept
        //Supplier<връща> -> get
        //Predicate<приема> -> връща true / false -> test
        //BiFunction<приема1, приема2, връща> -> apply
        String[] names = scanner.nextLine().split("\\s+");
        //"Peter George Alex Stan".split() -> ["Peter", "George", "Alex", "Stan"]

        //name -> отпечатваме "Sir " + name
        Consumer<String> printName = name -> System.out.println("Sir " + name);
        Arrays.stream(names).forEach(printName);

        /*for (String name : names) {
            printName.accept(name);
        }*/
    }
}