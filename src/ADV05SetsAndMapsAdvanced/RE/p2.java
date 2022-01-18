package ADV05SetsAndMapsAdvanced.RE;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String guests = scanner.nextLine();
        Set<String> guestList = new TreeSet<>();

        while (!guests.equals("PARTY")){
            guestList.add(guests);
            guests = scanner.nextLine();
        }
        String didntCome = scanner.nextLine();
        while (!didntCome.equals("END")){
            guestList.remove(didntCome);
            didntCome = scanner.nextLine();
        }
        System.out.println(guestList.size());
        for (String guest : guestList) {
            System.out.println(guest);
        }

    }
}
