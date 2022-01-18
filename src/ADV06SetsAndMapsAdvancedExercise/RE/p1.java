package ADV06SetsAndMapsAdvancedExercise.RE;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class p1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> username = new LinkedHashSet<>();
        int countUsername = Integer.parseInt(scanner.nextLine());

        while (countUsername-- >0){
            String inputUsername = scanner.nextLine();
            username.add(inputUsername);
        }
        for (String user : username) {
            System.out.println(user);
        }

    }
}
