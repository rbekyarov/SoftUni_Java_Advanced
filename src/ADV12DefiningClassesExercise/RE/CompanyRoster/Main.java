package ADV12DefiningClassesExercise.RE.CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Employee>>  map = new HashMap<>();

        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s++");
            //name, salary, position, department, email and age
            String name = input[0];
            double salary = Double.parseDouble(input[1]);
            String position = input[2];
            String department = input[3];
            Employee employee = null;
            if (input.length == 6) {
                String email = input[4];
                int age = Integer.parseInt(input[5]);
                employee = new Employee(name, salary, position, department, email, age);
            } else if (input.length == 4) {
                employee = new Employee(name, salary, position, department);

            } else if (input.length == 5) {
                if (input[4].contains("@")) {
                    String email = input[4];
                    employee = new Employee(name, salary, position, department, email);
                } else {
                    int age = Integer.parseInt(input[4]);
                    employee = new Employee(name, salary, position, department, age);
                }

            }
            if (!map.containsKey(department)) {
                map.put(department, new ArrayList<>());
            }
            map.get(department).add(employee);
        }
        String maxAverageSalaryDepartment = map.entrySet()
                .stream()
                .max(Comparator.comparingDouble(entry -> getAverageSalary(entry.getValue())))
                .get() //entry (отдел -> списък със служителите): отделът с най-висока заплата
                .getKey();

        System.out.printf("Highest Average Salary: %s%n", maxAverageSalaryDepartment);
        //списък със хората от отдела с най-висока заплата
        List<Employee> employeeList = map.get(maxAverageSalaryDepartment);
        employeeList.sort(Comparator.comparingDouble(employee -> employee.getSalary())); //ascending by salary
        Collections.reverse(employeeList); //descending

        for (Employee employee : employeeList) {
            System.out.println(employee);
        }


    }

    public static double getAverageSalary(List<Employee> employees) {
        //сума от заплатите / бр. служителите
        double sum = 0;
        for (Employee employee : employees ) {
            sum += employee.getSalary();
        }
        return sum / employees.size();
    }
}
