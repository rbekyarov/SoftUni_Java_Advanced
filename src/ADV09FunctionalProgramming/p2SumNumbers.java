/*Write a program that reads one line of Integers separated by ", ".
Print the count of the numbers and their sum.*/

package ADV09FunctionalProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class p2SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();

        System.out.println("Count = " + Arrays.stream(numbers).count());

        System.out.println("Sum = " + Arrays.stream(numbers).sum());
    }
}
