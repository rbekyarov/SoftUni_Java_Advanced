package ADV12DefiningClassesExercise.RE.OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();
        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            Person person = new Person(name, age);
            if (person.getAge() > 30) {
                personList.add(person);
            }


        }
        personList.stream()
                .sorted(Comparator.comparing(person -> person.getName()))
                .forEach(person -> System.out.println(person));

    }
}
