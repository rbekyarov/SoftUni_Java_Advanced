package ADV12DefiningClassesExercise.P2CompanyRoster;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countEmployee = Integer.parseInt(scanner.nextLine());

        Map<String, Department> departmentMap = new HashMap<>();

        while (countEmployee > 0) {
            String[] inputPerson = scanner.nextLine().split("\\s+");
            String name = inputPerson[0];
            double salary = Double.parseDouble(inputPerson[1]);
            String position = inputPerson[2];
            String department = inputPerson[3];

            Employee employee = null;

            if (inputPerson.length == 4) {
                employee = new Employee(name, salary, position, department);
            } else if (inputPerson.length == 6) {
                String mail = inputPerson[4];
                int age = Integer.parseInt(inputPerson[5]);
                employee = new Employee(name, salary, position, department, mail, age);
            } else if (inputPerson.length == 5) {
                try {
                    int age = Integer.parseInt(inputPerson[4]);
                    employee = new Employee(name, salary, position, department, age);
                } catch (NumberFormatException e) {
                    String mail = inputPerson[4];
                    employee = new Employee(name, salary, position, department, mail);
                }
            }
            departmentMap.putIfAbsent(department, new Department(department));
            departmentMap.get(department).getList().add(employee);
            countEmployee--;

        }

        Department highExpensiveDepartment = departmentMap.entrySet()
                .stream()
                .max(Comparator.comparing(e -> e.getValue().getAvgSalary()))
                .get()
                .getValue();
        System.out.println("Highest Average Salary: " + highExpensiveDepartment.getName());

        highExpensiveDepartment.getList()
                .stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(System.out::println);

    }
}
