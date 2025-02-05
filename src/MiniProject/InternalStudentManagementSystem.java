package MiniProject;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.*;

class InternalStudentManagementSystem {
    private static final String FILE_NAME = "students.json";
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final File file = new File(FILE_NAME);
    private static List<Student> students = new ArrayList<>();
    private final Scanner scan = new Scanner(System.in);

    // Constructor to load student data from JSON file
    public InternalStudentManagementSystem() {
        loadStudents();
    }

    // Load students from JSON file
    private void loadStudents() {
        if (!file.exists()) {
            System.out.println("No Student Data Available...");
            return;
        }

        try {
            students = objectMapper.readValue(file, new TypeReference<List<Student>>() {});
            System.out.println("Student Data Loaded Successfully.");
        } catch (IOException e) {
            System.err.println("Error Loading Data: " + e.getMessage());
            students = new ArrayList<>(); // Ensure the list is not null
        }
    }

    // Add student
    public void addStudent(int id, String name, int age, String grade, String email) {
        if (students.stream().anyMatch(s -> s.getId() == id)) {
            System.out.println("Error: Student ID already exists!");
            return;
        }
        students.add(new Student(id, name, age, grade, email));
        writeInJson();
        System.out.println("Student added successfully!");
    }

    // Write students list to JSON file
    private void writeInJson() {
        try {
            objectMapper.writeValue(file, students);
            System.out.println("Data Saved Successfully.");
        } catch (IOException e) {
            System.err.println("Error Saving Data: " + e.getMessage());
        }
    }

    // View all students
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            students.forEach(System.out::println);
        }
    }

    // Search student by ID
    public void searchStudent(int id) {
        students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("Student not found."));
    }

    // Update student details
    public void updateStudent(int id, String name, int age, String grade, String email) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.set(i, new Student(id, name, age, grade, email));
                writeInJson();
                System.out.println("Student updated successfully!");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    // Delete student
    public void deleteStudent(int id) {
        if (students.removeIf(s -> s.getId() == id)) {
            writeInJson();
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Sort students by age or name
    public void sortStudents(String criterion) {
        students.stream()
                .sorted(criterion.equalsIgnoreCase("age") ? Comparator.comparing(Student::getAge) : Comparator.comparing(Student::getName))
                .forEach(System.out::println);
    }

    // Filter students by grade
    public void filterByGrade(String grade) {
        students.stream()
                .filter(s -> s.getGrade().equalsIgnoreCase(grade))
                .forEach(System.out::println);
    }
}
