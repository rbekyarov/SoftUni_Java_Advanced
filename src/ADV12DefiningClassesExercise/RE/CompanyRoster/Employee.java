package ADV12DefiningClassesExercise.RE.CompanyRoster;

public class Employee {
    //name, salary, position, department, email and age
    private String name;
    private double salary;
    private String position;
    private String department;

    public double getSalary() {
        return salary;
    }

    private String email;
    private int age;

    public Employee(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
    }

    public Employee(String name, double salary, String position, String department, String email) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
    }

    public Employee(String name, double salary, String position, String department, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.age = age;
    }

    public Employee(String name, double salary, String position, String department, String email, int age) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        if(email==null){
            email = "n/a";
        }
        if(age==0){
            age =-1;
        }
        String result = String.format("%s %.2f %s %d",name,salary,email,age);
        return result;
    }
}
