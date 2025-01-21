package Day_n_Fifteen;

import java.util.*;
import java.util.stream.*;

class Stdnt {
    String name;

    Stdnt(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class StudentFilter {
    public static List<Stdnt> findStudentsByStartingLetter(List<Stdnt> students, char letter) {
        return students.stream()
                .filter(student -> student.name.startsWith(String.valueOf(letter)))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Stdnt> students = Arrays.asList(
                new Stdnt("mathu"),
                new Stdnt("valli"),
                new Stdnt("mano"),
                new Stdnt("David")
        );

        char letter = 'A';
        List<Stdnt> matchingStudents = findStudentsByStartingLetter(students, letter);

        System.out.println("Students whose names start with '" + letter + "':");
        matchingStudents.forEach(System.out::println);

    }
}
