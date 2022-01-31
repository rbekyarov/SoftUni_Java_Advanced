package ADV17ExamPrep.E28June2020;

import java.util.*;
import java.util.stream.Collectors;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] bombEffect = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] bombCasing = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> bombEffectQueue = new ArrayDeque<>();
        for (int e : bombEffect) {
            bombEffectQueue.offer(e);
        }
        ArrayDeque<Integer> bombCasingStack = new ArrayDeque<>();
        for (int e : bombCasing) {
            bombCasingStack.push(e);
        }
        Map<String, Integer> bombs = new TreeMap<>();
        bombs.put("Datura Bombs", 0);
        bombs.put("Cherry Bombs", 0);
        bombs.put("Smoke Decoy Bombs", 0);
        int countDatura = 0;
        int countCherry = 0;
        int countSmoke = 0;
        while (!bombCasingStack.isEmpty() && !bombEffectQueue.isEmpty()) {
            if (countDatura >= 3 && countCherry >= 3 && countSmoke >= 3) {
                break;
            } else {


                int result = bombEffectQueue.peek() + bombCasingStack.peek();
                if (result == 40) {
                    countDatura++;
                    bombEffectQueue.poll();
                    bombCasingStack.pop();

                    int currentCount = bombs.get("Datura Bombs");
                    bombs.put("Datura Bombs", currentCount + 1);

                } else if (result == 60) {
                    countCherry++;
                    bombEffectQueue.poll();
                    bombCasingStack.pop();

                    int currentCount = bombs.get("Cherry Bombs");
                    bombs.put("Cherry Bombs", currentCount + 1);

                } else if (result == 120) {
                    countSmoke++;
                    bombEffectQueue.poll();
                    bombCasingStack.pop();

                    int currentCount = bombs.get("Smoke Decoy Bombs");
                    bombs.put("Smoke Decoy Bombs", currentCount + 1);

                } else {

                    int element = bombCasingStack.pop() - 5;
                    bombCasingStack.push(element);
                }
            }
        }

        if (bombEffectQueue.isEmpty() && bombCasingStack.isEmpty()) {
            System.out.println("You don't have enough materials to fill the bomb pouch.");
        } else {
            System.out.println("Bene! You have successfully filled the bomb pouch!");
        }

        if (!bombEffectQueue.isEmpty()) {
            System.out.print("Bomb Effects: ");
            String queueLiquidsStr = bombEffectQueue.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.printf("%s%n", String.join(",", queueLiquidsStr));

        } else {
            System.out.println("Bomb Effects: empty");
        }
        if (!bombCasingStack.isEmpty()) {
            System.out.print("Bomb Casings: ");
            String queueLiquidsStr = bombCasingStack.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.printf("%s%n", String.join(",", queueLiquidsStr));

        } else {
            System.out.println("Bomb Casings: empty");
        }
        for (Map.Entry<String, Integer> entry : bombs.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
