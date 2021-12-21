package ADV11DefiningClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] input = scanner.nextLine().split(" ");
            String brand = input[0];
            String model = input[1];
            int horsePower =Integer.parseInt(input[2]);
            Car car = new Car(brand,model,horsePower);
            System.out.printf("The car is: %s %s - %d HP.%n", car.getBrand(),car.getModel(),car.getHorsePower());
        }
    }
}
