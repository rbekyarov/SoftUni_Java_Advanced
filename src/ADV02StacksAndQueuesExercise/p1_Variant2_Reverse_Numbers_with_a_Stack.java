package ADV02StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class p1_Variant2_Reverse_Numbers_with_a_Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> numbersStack = new ArrayDeque<>();

        Arrays.stream(scanner.nextLine().split(" ")).forEach(e-> numbersStack.push(e));
        Arrays.stream(numbersStack.toArray()).forEach(e-> System.out.print(numbersStack.pop()+" "));

    }
}
