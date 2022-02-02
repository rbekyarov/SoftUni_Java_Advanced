package ADV17ExamPrep.E16December2020;

import java.util.*;
import java.util.stream.Collectors;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] liquids = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] ingredients = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> ingredientsStack = new ArrayDeque<>();
        for (int e : ingredients) {
            ingredientsStack.push(e);
        }
        ArrayDeque<Integer> liquidsQueue = new ArrayDeque<>();
        for (int e : liquids) {
            liquidsQueue.offer(e);
        }
        Map<String, Integer> mapFood = new TreeMap<>();
        mapFood.put("Bread", 0);
        mapFood.put("Cake", 0);
        mapFood.put("Pastry", 0);
        mapFood.put("Fruit Pie", 0);

        int countBread = 0;
        int countCake = 0;
        int countPastry = 0;
        int countFruitPie = 0;
        while (!ingredientsStack.isEmpty() && !liquidsQueue.isEmpty()) {
            int sumElement = ingredientsStack.peek() + liquidsQueue.peek();
            if (sumElement == 25) {
                liquidsQueue.poll();
                ingredientsStack.pop();
                countBread++;
                int currentBread = mapFood.get("Bread");
                mapFood.put("Bread", currentBread + 1);

            } else if (sumElement == 50) {
                liquidsQueue.poll();
                ingredientsStack.pop();
                countCake++;
                int currentBread = mapFood.get("Cake");
                mapFood.put("Cake", currentBread + 1);

            } else if (sumElement == 75) {
                liquidsQueue.poll();
                ingredientsStack.pop();
                countPastry++;
                int currentBread = mapFood.get("Pastry");
                mapFood.put("Pastry", currentBread + 1);

            } else if (sumElement == 100) {
                liquidsQueue.poll();
                ingredientsStack.pop();
                countFruitPie++;
                int currentBread = mapFood.get("Fruit Pie");
                mapFood.put("Fruit Pie", currentBread + 1);
            } else {
                liquidsQueue.poll();
                int currentIngredients = ingredientsStack.pop() + 3;
                ingredientsStack.push(currentIngredients);
            }
        }
        if (countBread != 0 && countCake != 0 && countPastry != 0 && countFruitPie != 0) {
            System.out.println("Wohoo! You succeeded in cooking all the food!");
        } else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to cook everything.");
        }
        if (liquidsQueue.isEmpty()) {
            System.out.println("Liquids left: none");
        } else {
            System.out.print("Liquids left: ");
            String result = liquidsQueue.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.printf("%s%n", String.join(",", result));
        }
        if (ingredientsStack.isEmpty()) {
            System.out.println("Ingredients left: none");
        } else {
            System.out.print("Ingredients left: ");
            String result = ingredientsStack.stream().map(String::valueOf).collect(Collectors.joining(", "));
            System.out.printf("%s%n", String.join(",", result));
        }
        for (Map.Entry<String, Integer> entry : mapFood.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}