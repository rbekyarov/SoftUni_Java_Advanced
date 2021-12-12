package ADV05SetsAndMapsAdvanced;


import java.util.Scanner;
import java.util.TreeSet;

public class p2SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String guest = scanner.nextLine();
        TreeSet<String> guestList = new TreeSet<>();
        while (!guest.equals("PARTY")) {
            guestList.add(guest);
            guest = scanner.nextLine();
        }
        String guestOut = scanner.nextLine();
        while (!guestOut.equals("END")) {
            guestList.remove(guestOut);
            guestOut = scanner.nextLine();
        }
        System.out.println(guestList.size());
        for (String guestNotCome : guestList) {
            System.out.println(guestNotCome);
        }

    }
}
