package ADV11DefiningClasses.P2CarConstructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ADV11DefiningClasses.P2CarConstructors.Car> cars = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        ADV11DefiningClasses.P2CarConstructors.Car car = null;
        while (n-- > 0) {
            String[] input = scanner.nextLine().split(" ");
            if (input.length == 1) {
                String brand = input[0];
                car = new ADV11DefiningClasses.P2CarConstructors.Car(brand);
            } else if (input.length == 2) {
                String brand = input[0];
                String model = input[1];
                car = new ADV11DefiningClasses.P2CarConstructors.Car(brand, model);
            } else if (input.length == 3) {
                String brand = input[0];
                String model = input[1];
                int horsePower = Integer.parseInt(input[2]);
                car = new ADV11DefiningClasses.P2CarConstructors.Car(brand, model, horsePower);
            }

            cars.add(car);
        }
        for (Car e : cars) {
            System.out.printf("The car is: %s %s - %d HP.%n", e.getBrand(), e.getModel(), e.getHorsePower());
        }
    }
}