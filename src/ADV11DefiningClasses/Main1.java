package ADV11DefiningClasses;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car();
        car.setBrand("Chevrolet");
        car.setModel("Impala");
        car.setHorsePower(390);

        System.out.printf("The car is: %s %s - %d HP.", car.getBrand(),car.getModel(),car.getHorsePower());
    }
}
