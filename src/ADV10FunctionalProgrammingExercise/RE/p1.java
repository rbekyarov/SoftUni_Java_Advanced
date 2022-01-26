package ADV10FunctionalProgrammingExercise.RE;


import java.util.Scanner;
import java.util.function.Consumer;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Function<приема, връща> -> apply
        //Consumer<приема> -> void -> accept
        //Supplier<връща> -> get
        //Predicate<приема> -> връща true / false -> test
        //BiFunction<приема1, приема2, връща> -> apply
        String input = scanner.nextLine(); //"Peter George Alex"
        String[] names = input.split("\\s+");//"Peter George Alex".split("\\s+") -> ["Peter", "George", "Alex"]

        //начин 1
        /*for (String name : names) {
            System.out.println(name);
        }*/


        //начин 2
        //име -> печатаме
        /*Consumer<String> printName = name -> System.out.println(name);
        for (String name : names) {
            printName.accept(name);
        }*/

        //начин 3
        //масив с имена -> печата
        Consumer<String[]> printNames = array -> {
            for (String name : array) {
                System.out.println(name);
            }
        };
        printNames.accept(names);
    }
}