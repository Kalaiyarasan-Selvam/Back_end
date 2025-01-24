package Day_q_Eighteen;

import java.util.*;
import java.util.stream.*;

public class StudentAnalysis {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("John", "Computer Science", new int[]{85, 90, 78, 88, 92}),
                new Student("Alice", "Mathematics", new int[]{70, 65, 75, 80, 68}),
                new Student("Bob", "Physics", new int[]{50, 55, 60, 58, 54}),
                new Student("Diana", "Computer Science", new int[]{45, 42, 38, 40, 44}),
                new Student("Eve", "Mathematics", new int[]{95, 92, 90, 88, 94}),
                new Student("Charlie", "Physics", new int[]{85, 80, 78, 84, 82})
        );

        System.out.println("Top 3 Students");
        students.stream()
                .sorted(Comparator.comparingDouble(Student::getAverageMarks).reversed())
                .limit(3)
                .forEach(s -> System.out.println(s.getName() + " - " + s.getAverageMarks()));


        System.out.println();

        System.out.println("Grade for Student");
        students.stream().forEach(s-> System.out.println(s.getName()+" : "+s.getDepartment()+" : "+s.getGrade()));

        System.out.println();

        System.out.println("Average Marks by Department");
        students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment,
                        Collectors.averagingDouble(Student::getAverageMarks)))
                .forEach((dept, avg) -> System.out.println(dept + ": " + avg));

        System.out.println();

        System.out.println("Top Student in Each Department");
        students.stream()
                .collect(Collectors.groupingBy(Student::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Student::getAverageMarks))))
                .forEach((dept, topStudent) ->
                        topStudent.ifPresent(s -> System.out.println(dept + ": " + s.getName() + " - " + s.getAverageMarks())));

        System.out.println();

        System.out.println("Failed Students in Each Department");
        students.stream()
                .filter(s -> s.getAverageMarks() < 50)
                .collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()))
                .forEach((dept, count) -> System.out.println(dept + ": " + count));
    }
}
