package ADV17ExamPrep.E14April2021.university;

import java.util.ArrayList;
import java.util.List;

public class University {
    private int capacity;
    private List<Student> students;

    public University(int capacity) {
        this.capacity = capacity;
        this.students = new ArrayList<>();

    }

    public List<Student> getStudents() {
        return students;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Student> getData() {
        return students;
    }

    public String registerStudent(Student student) {
        if (this.capacity > students.size()) {
            if (this.students.contains(student)) {
                return "Student is already in the university";
            } else {
                this.students.add(student);
                return String.format("Added student %s %s", student.getFirstName(), student.getLastName());
            }
        } else {
            return "No seats in the university";
        }
    }

    public int getStudentCount() {
        return students.size();
    }

    public String dismissStudent(Student student) {
        if (students.contains(student)) {
            students.remove(student);
            return String.format("Removed student %s %s", student.getFirstName(), student.getLastName());
        } else {
            return "Student not found";
        }
    }

    public Student getStudent(String firstName, String lastName) {
        return students.stream().filter(e -> e.getFirstName().equals(firstName) &&
                e.getLastName().equals(lastName)).findFirst().orElse(null);
    }

    public String getStatistics() {


        StringBuilder output = new StringBuilder();

        this.students.forEach(e -> output.append("//==Student: First Name = ").append(e.getFirstName()).append(", Last Name = ")
                .append(e.getLastName()).append(", Best Subject = ").append(e.getBestSubject()).append(System.lineSeparator()));

        return output.toString();
    }
}
