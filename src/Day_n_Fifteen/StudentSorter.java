package Day_n_Fifteen;

import java.util.ArrayList;

import java.util.List;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', gpa=" + gpa + '}';
    }
}

public class StudentSorter {
    public static void sortStudentsByGpa(List<Student> students)
    {
        students.sort((s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()));
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("kalai", 3.6));
        students.add(new Student("tamil", 3.9));
        students.add(new Student("selvam", 3.7));

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }
        sortStudentsByGpa(students);
        System.out.println("\nAfter sorting by GPA in descending order:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
