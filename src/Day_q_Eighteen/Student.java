package Day_q_Eighteen;

import java.util.Arrays;

class Student {
    private String name;
    private String department;
    private int[] marks;
    private double averageMarks;
    private String grade;

    public Student(String name, String department, int[] marks) {
        this.name = name;
        this.department = department;
        this.marks = marks;
        this.averageMarks = calculateAverage();
        this.grade = assignGrade();
    }

    private double calculateAverage() {
        return Arrays.stream(marks).average().orElse(0.0);
    }

    private String assignGrade() {
        if (averageMarks >= 85) return "A";
        else if (averageMarks >= 70) return "B";
        else if (averageMarks >= 50) return "C";
        else return "fail";
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getAverageMarks() {
        return averageMarks;
    }

    public String getGrade() {
        return grade;
    }
}
