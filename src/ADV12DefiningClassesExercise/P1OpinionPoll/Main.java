package ADV12DefiningClassesExercise.P1OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> peoples = new ArrayList<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String personData = scanner.nextLine();
            String name = personData.split(" ")[0];
            int age = Integer.parseInt(personData.split(" ")[1]);
            if (age > 30) {
                peoples.add(new Person(name, age));
            }
        }
        peoples.sort(Comparator.comparing(p -> p.getName()));
        for (Person person : peoples) {
            System.out.println(person.getName() + " - " + person.getAge());
        }

    }
}
