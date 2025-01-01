//Create a class Person with attributes name and age.
// Derive a class Student that adds rollNumber and marks.
// Write methods to display both Person and Student details

package Day_c_Three.inheritance;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNumber;
    double marks;

    Student(String name, int age, int rollNumber, double marks) {
        super(name, age); // Call to Person class constructor
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    void displayStudentDetails() {
        displayPersonDetails(); // Display Person details
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20, 101, 85.5);

        student.displayStudentDetails();
    }
}
