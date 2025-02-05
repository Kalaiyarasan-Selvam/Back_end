package MiniProject;

import java.io.Serializable;

public class Student implements Serializable {
    private int id;
    private String name;
    private int age;
    private String grade;
    private String email;

    public Student(int id, String name, int age, String grade, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.email = email;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGrade() { return grade; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return id + " | " + name + " | Age: " + age + " | Grade: " + grade + " | Email: " + email;
    }
}
