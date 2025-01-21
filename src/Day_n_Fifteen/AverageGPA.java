package Day_n_Fifteen;

import java.util.*;

class Stud2 {
    String name;
    double gpa;


    Stud2(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
}

public class AverageGPA {
    public static double calculateAverageGPA(List<Stud2> students) {
        return students.stream()
                .mapToDouble(student -> student.gpa)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        List<Stud2> students = Arrays.asList(
                new Stud2("Alice", 3.8),
                new Stud2("Bob", 3.5),
                new Stud2("Charlie", 3.9),
                new Stud2("Dave", 3.6)
        );

        double averageGPA = calculateAverageGPA(students);
        System.out.println("Average GPA: " + averageGPA);
    }
}
