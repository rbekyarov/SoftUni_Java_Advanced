package ADV05SetsAndMapsAdvanced.RE;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] input = scanner.nextLine().split(", ");
        Set<String> parking = new LinkedHashSet<>();
        while (!input[0].equals("END")){
            if (input[0].equals("IN")){
                parking.add(input[1]);
            }else {
                parking.remove(input[1]);
            }
            input= scanner.nextLine().split(", ");
        }
        if(parking.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }
        for (String car : parking) {
            System.out.println(car);
        }

    }
}
