package Day_p_seventeen.Method_Refactor;

class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', marks=" + marks + "}";
    }
}

@FunctionalInterface
interface StudentFactory {
    stud create(String name, int marks);
}

public class ConstructorReference {
    public static void main(String[] args) {
        StudentFactory factory = stud::new;

        stud student1 = factory.create("kalai", 85);
        stud student2 = factory.create("tamil", 92);

        System.out.println(student1);
        System.out.println(student2);
    }
}
