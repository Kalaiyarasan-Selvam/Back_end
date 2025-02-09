package MiniProject;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

class InternalStudentManagementSystem {
    private static final String FILE_NAME = "students.json";
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final File file = new File(FILE_NAME);
    private static List<Student> students = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public InternalStudentManagementSystem() {
        loadStudents();
    }

    private void loadStudents() {
        if (!file.exists()) {
            System.out.println("No Student Data Available...");
            return;
        }

        try {
            students = objectMapper.readValue(file, new TypeReference<List<Student>>() {
            });
            System.out.println("Student Data Loaded Successfully.");
        } catch (IOException e) {
            System.err.println("Error Loading Data: " + e.getMessage());
            students = new ArrayList<>(); // Ensure the list is not null
        }
    }

    private void writeInJson() {
        try {
            objectMapper.writeValue(file, students);
            System.out.println("Data Saved Successfully.");
        } catch (IOException e) {
            System.err.println("Error Saving Data: " + e.getMessage());
        }
    }

    public void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Grade: ");
        String grade = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        if (!isValidInteger(id) || !isValidString(name) || !isValidInteger(age) || !isValidString(grade) || !isValidEmail(email)) {
            System.out.println("Invalid input! Please enter valid values.");
            return;
        }

        if (students.stream().anyMatch(s -> s.getId() == id)) {
            System.out.println("Error: Student ID already exists!");
            return;
        }
        students.add(new Student(id, name, age, grade, email));
        writeInJson();
        System.out.println("Student added successfully!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            students.forEach(System.out::println);
        }
    }

    public void searchStudent() {
        System.out.print("Search by (1) ID or (2) Name: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.print("Enter Student ID: ");
            int id = scanner.nextInt();
            searchStudentById(id);
        } else if (choice == 2) {
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();
            searchStudentByName(name);
        } else {
            System.out.println("Invalid choice!");
        }
    }

    private void searchStudentById(int id) {
        students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .ifPresentOrElse(System.out::println, () -> System.out.println("Student not found."));
    }

    private void searchStudentByName(String name) {
        List<Student> foundStudents = students.stream()
                .filter(s -> s.getName().equalsIgnoreCase(name))
                .toList();

        if (foundStudents.isEmpty()) {
            System.out.println("No student found with name: " + name);
        } else {
            foundStudents.forEach(System.out::println);
        }
    }

    public void deleteStudent() {
        System.out.print("Delete by (1) ID or (2) Name: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.print("Enter Student ID: ");
            int id = scanner.nextInt();
            deleteStudentById(id);
        } else if (choice == 2) {
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();
            deleteStudentByName(name);
        } else {
            System.out.println("Invalid choice!");
        }
    }

    private void deleteStudentById(int id) {
        if (students.removeIf(s -> s.getId() == id)) {
            writeInJson();
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    private void deleteStudentByName(String name) {
        boolean removed = students.removeIf(s -> s.getName().equalsIgnoreCase(name));
        if (removed) {
            writeInJson();
            System.out.println("Student(s) with name '" + name + "' deleted successfully!");
        } else {
            System.out.println("No student found with the name: " + name);
        }
    }

    public void sortStudents() {
        System.out.println("Sort by (1) ID, (2) Name, (3) Age, (4) Grade: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 -> students.sort(Comparator.comparing(Student::getId));
            case 2 -> students.sort(Comparator.comparing(Student::getName));
            case 3 -> students.sort(Comparator.comparing(Student::getAge));
            case 4 -> students.sort(Comparator.comparing(Student::getGrade));
            default -> {
                System.out.println("Invalid sort criterion! Choose from (1-4).");
                return;
            }
        }
        students.forEach(System.out::println);
    }

    private boolean isValidInteger(int value) {
        return value > 0;
    }

    private boolean isValidString(String str) {
        return str != null && !str.trim().isEmpty();
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return Pattern.matches(emailRegex, email);
    }

    public void filterByGrade() {
        System.out.print("Enter Grade to Filter: ");
        String grade = scanner.nextLine().trim();

        List<Student> filteredStudents = students.stream()
                .filter(s -> s.getGrade().equalsIgnoreCase(grade))
                .toList();

        if (filteredStudents.isEmpty()) {
            System.out.println("No students found with grade: " + grade);
        } else {
            filteredStudents.forEach(System.out::println);
        }
    }

    public void updateStudent() {
        System.out.print("Enter Student ID to Update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Optional<Student> studentOpt = students.stream()
                .filter(s -> s.getId() == id)
                .findFirst();

        if (studentOpt.isEmpty()) {
            System.out.println("Student not found!");
            return;
        }
    }
}
