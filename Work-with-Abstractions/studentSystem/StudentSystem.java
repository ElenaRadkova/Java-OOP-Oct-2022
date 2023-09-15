package studentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> students;

    public StudentSystem() {
        this.students = new HashMap<>();
    }

    public Map<String, Student> getStudents() {
        return this.students;
    }

    public void parseCommand(String[] commandPart) {

        switch (commandPart[0]) {
            case "Create" -> {
                createStudent(commandPart);
                break;
            }
            case "Show" -> {
                showStudent(commandPart);
                break;
            }
        }
    }

    private void showStudent(String[] commandPart) {
        String name = commandPart[1];
        if (students.containsKey(name)) {
            Student student = students.get(name);
            appendGrade(student);
        }
    }

    private void appendGrade(Student student) {
        StringBuilder output = new StringBuilder(student.toString());

        if (student.getGrade() >= 5.00) {
            output.append(" Excellent student.");
        } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
            output.append(" Average student.");
        } else {
            output.append(" Very nice person.");
        }

        System.out.println(output);
    }

    private void createStudent(String[] commandPart) {
        String name = commandPart[1];
        int age = Integer.parseInt(commandPart[2]);
        double grade = Double.parseDouble(commandPart[3]);

        Student student = new Student(name, age, grade);
        students.putIfAbsent(name, student);
    }
}
