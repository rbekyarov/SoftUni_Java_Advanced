/*Write a program that reads one line of text from the console.
Print the count of words that start with a Uppercase letter,
after that print all these words in the same order, like you found them in the text.*/

package ADV09FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class p3CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> isUpper = e -> Character.isUpperCase(e.charAt(0));

        List<String> inputText = Arrays.stream(scanner.nextLine().split(" ")).
                filter(e -> isUpper.test(e)).collect(Collectors.toList());

        System.out.println(inputText.size());
        inputText.stream().forEach(e -> System.out.println(e));

    }
}
