package Day_i_Ten;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hash_Map {
    public static void main(String[] args) {
        Map<String, Integer> studentGrades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the number of students to add:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter student name:");
            String name = scanner.nextLine();
            System.out.println("Enter grade for " + name + ":");
            int grade = scanner.nextInt();
            scanner.nextLine();
            studentGrades.put(name, grade);
        }

        System.out.println("Enter the name of the student to update:");
        String studentToUpdate = scanner.nextLine();
        if (studentGrades.containsKey(studentToUpdate)) {
            System.out.println("Enter the new grade for " + studentToUpdate + ":");
            int newGrade = scanner.nextInt();
            scanner.nextLine();
            studentGrades.put(studentToUpdate, newGrade);
        } else {
            System.out.println("Student not found.");
        }

        System.out.println("Enter the name of the student to retrieve their grade:");
        String studentToRetrieve = scanner.nextLine();
        if (studentGrades.containsKey(studentToRetrieve)) {
            System.out.println(studentToRetrieve + "'s Grade: " + studentGrades.get(studentToRetrieve));
        } else {
            System.out.println("Student not found.");
        }


        System.out.println("All Students and their Grades:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}
