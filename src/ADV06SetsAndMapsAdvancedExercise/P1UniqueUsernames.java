package ADV06SetsAndMapsAdvancedExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class P1UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countUsername = Integer.parseInt(scanner.nextLine());
        LinkedHashSet<String> uniqUserName = new LinkedHashSet<>();
        for (int count = 0; count < countUsername; count++) {
            String username = scanner.nextLine();
            uniqUserName.add(username);
        }
        for (String username : uniqUserName) {
            System.out.println(username);
        }
    }
}
