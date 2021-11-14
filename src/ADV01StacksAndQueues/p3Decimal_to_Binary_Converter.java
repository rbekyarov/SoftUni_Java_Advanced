package ADV01StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class p3Decimal_to_Binary_Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int currentNumber = Integer.parseInt(scanner.nextLine());
        while (currentNumber != 0) {

            if (currentNumber % 2 == 0) {
                stack.push(0);
            } else {
                stack.push(1);
            }
            currentNumber /= 2;
        }
        for (Integer e:stack)
        System.out.print(e);
    }
}
