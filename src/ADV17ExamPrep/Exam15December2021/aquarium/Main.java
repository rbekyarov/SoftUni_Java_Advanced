package ADV17ExamPrep.Exam15December2021.aquarium;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Aquarium aquarium = new Aquarium("Ocean", 5, 15);
        Fish fish = new Fish("Goldy", "gold", 4);
        System.out.println(fish.toString());

        aquarium.add(fish);
        aquarium.findFish("Goldy");
        aquarium.getFishInPool();
        System.out.println(aquarium.remove("Goldy"));

        Fish secondFish = new Fish("Dory", "blue", 2);
        Fish thirdFish = new Fish("Nemo", "orange", 5);

        aquarium.add(secondFish);
        aquarium.add(thirdFish);

        System.out.println(aquarium.report());

    }
}
