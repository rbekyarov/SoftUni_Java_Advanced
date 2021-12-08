package ADV02StacksAndQueuesExercise;
import java.util.ArrayDeque;

import java.util.Scanner;

public class p1Reverse_Numbers_with_a_Stack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        ArrayDeque <String> numbersStack = new ArrayDeque<>();
        for (String element :numbers){
            numbersStack.push(element);
        }
        while (!numbersStack.isEmpty()){
            System.out.print(numbersStack.pop()+" ");
        }
    }
}
