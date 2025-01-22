package Day_o_sixteen;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Students {
    String name;
    int grade;

    public Students(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return name + ": " + grade;
    }
}

public class UpdateStudentGrades {
    public static void main(String[] args) {
        List<Students> students = Arrays.asList(
                new Students("John", 70),
                new Students("Alice", 60)
        );

        Consumer<Students> increaseGrade = student -> student.grade += 10;

        updateGrades(students, increaseGrade);

        for (Students student : students) {
            System.out.println(student);
        }
    }

    public static void updateGrades(List<Students> students, Consumer<Students> consumer) {
        for (Students student : students) {
            consumer.accept(student);
        }
    }
}
