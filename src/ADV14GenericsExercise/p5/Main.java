package ADV14GenericsExercise.p5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Box<String> box = new Box<>();
        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();
            box.add(text);
        }

        String element = scanner.nextLine(); //елемент, за който търся колко от елементите в списъка са по-големи
        System.out.println(box.countGreaterThan(element));
    }
}
