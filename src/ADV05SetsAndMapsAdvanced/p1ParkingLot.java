package ADV05SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;


public class p1ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        LinkedHashSet<String> parkingLot = new LinkedHashSet<>();

        while (!input[0].equals("END")) {
            String car = input[1];

            if (input[0].equals("IN")) {
                parkingLot.add(car);
            } else {
                parkingLot.remove(car);
            }
            input = scanner.nextLine().split(", ");
        }
        if (!parkingLot.isEmpty()) {
            for (String car : parkingLot) {
                System.out.println(car);
            }
        } else {
            System.out.println("Parking Lot is Empty");
        }
    }
}
