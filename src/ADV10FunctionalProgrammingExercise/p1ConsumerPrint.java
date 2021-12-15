/*Write a program that reads a collection of strings, separated by one or more whitespaces,
from the console and then prints them onto the console.
Each string should be printed on a new line. Use a Consumer<T>.*/

package ADV10FunctionalProgrammingExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class p1ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = scanner.nextLine().split("\\s+");

        Consumer<String> printElementArr = e -> System.out.println(e);

        Arrays.stream(arr).forEach(e -> printElementArr.accept(e));

    }
}
