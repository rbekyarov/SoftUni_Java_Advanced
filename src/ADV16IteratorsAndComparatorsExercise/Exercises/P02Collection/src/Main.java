package ADV16IteratorsAndComparatorsExercise.Exercises.P02Collection.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ListyIterator listyIterator = null;

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] commandData = input.split("\\s+");

            String command = commandData[0];

            switch (command) {
                case "Create":
                    String[] initialValues = new String[commandData.length - 1];
                    System.arraycopy(commandData, 1, initialValues, 0, initialValues.length);
                    listyIterator = new ListyIterator(initialValues);
                    break;
                case "Move":
                    assert listyIterator != null;
                    System.out.println(listyIterator.move());
                    break;
                case "Print":
                    assert listyIterator != null;
                    try {
                        listyIterator.print();
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case "HasNext":
                    assert listyIterator != null;
                    System.out.println(listyIterator.hasNext());
                    break;
                case "PrintAll":
                    assert listyIterator != null;
                    try {
                        listyIterator.printAll();
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
            }


            input = scanner.nextLine();
        }
    }
}
