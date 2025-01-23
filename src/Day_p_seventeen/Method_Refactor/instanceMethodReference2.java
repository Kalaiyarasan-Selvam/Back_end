package Day_p_seventeen.Method_Refactor;

import java.util.ArrayList;
import java.util.List;

class stud {
    private String name;
    private int marks;
    public stud(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public void displayStudentDetails() {
        System.out.println("Student{name='" + name + "', marks=" + marks + "}");
    }
}

public class instanceMethodReference2 {
    public static void main(String[] args) {
        List<stud> students = new ArrayList<>();
        students.add(new stud("kalai", 85));
        students.add(new stud("tamil", 92));
        students.add(new stud("selvam", 78));

        students.forEach(stud::displayStudentDetails);
    }
}
