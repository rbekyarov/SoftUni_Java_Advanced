package ADV12DefiningClassesExercise.P2CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> list;

    public Department(String name) {
        this.name = name;
        list = new ArrayList<>();
    }

    public List<Employee> getList() {
        return list;
    }

    public double getAvgSalary() {
        return this.list
                .stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
    }

    public String getName() {
        return name;
    }
}
