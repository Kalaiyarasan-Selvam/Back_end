package Day_o_sixteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Student {
    String name;
    int grade;
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    @Override
    public String toString() {
        return name;
    }
}

public class FilterStudents {
    public static void main(String[] args) {
        List<Students> students = Arrays.asList(
                new Students("John", 75),
                new Students("Alice", 55),
                new Students("Mark", 88)
        );

        Predicate<Students> hasGoodGrade = student -> student.grade > 60;
        List<Students> filteredStudents = filter(students, hasGoodGrade);
        System.out.println(filteredStudents);
    }

    public static List<Students> filter(List<Students> students, Predicate<Students> predicate) {
        List<Students> result = new ArrayList<>();
        for (Students student : students) {
            if (predicate.test(student)) {
                result.add(student);
            }
        }
        return result;
    }
}
