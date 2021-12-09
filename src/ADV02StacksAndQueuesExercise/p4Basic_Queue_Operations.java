
package ADV02StacksAndQueuesExercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class p4Basic_Queue_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int S = Integer.parseInt(input.split(" ")[0]);
        int N = Integer.parseInt(input.split(" ")[1]);
        int X = Integer.parseInt(input.split(" ")[2]);
        ArrayDeque<Integer> queueNumbers = new ArrayDeque<>();
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int s = 0; s < S; s++) {
            queueNumbers.offer(arr[s]);
        }
        for (int i = 0; i < N; i++) {
            queueNumbers.poll();
        }
        if (queueNumbers.isEmpty()) {
            System.out.println(0);
        } else {
            if (queueNumbers.contains(X)) {
                System.out.println("true");
            } else {
                //Намираме и разпечатваме най малкото число в стека:
                // 1-ви вариант
                // System.out.println(stackNumbers.stream().mapToInt(e -> e).min().getAsInt());
                // 2-ри вариант
                // System.out.println(Collections.min(stackNumbers));
                // 3-ти вариант - чрез метод и алгоритъма за най малко число
                System.out.println(getMinNumber(queueNumbers));
            }
        }
    }

    private static int getMinNumber(ArrayDeque<Integer> stackNumbers) {
        int min = Integer.MAX_VALUE;
        for (int element : stackNumbers) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }
}
