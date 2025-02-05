package MiniProject;

import java.util.Scanner;

public class StudentAdmin {
    public static void main(String[] args) {
        InternalStudentManagementSystem sms = new InternalStudentManagementSystem();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student\n2. View Students\n3. Search Student\n4. Update Student\n5. Delete Student\n6. Sort Students\n7. Filter by Grade\n8. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("---- Enter Student Details ----");
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Grade: ");
                    String grade = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    sms.addStudent(id, name, age, grade, email);
                    break;
                case 2:
                    sms.viewStudents();
                    break;
                case 3:
                    System.out.print("Enter Student ID: ");
                    sms.searchStudent(sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter Student ID to Update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("New Age: ");
                    int newAge = sc.nextInt();
                    sc.nextLine();
                    System.out.print("New Grade: ");
                    String newGrade = sc.nextLine();
                    System.out.print("New Email: ");
                    String newEmail = sc.nextLine();
                    sms.updateStudent(uid, newName, newAge, newGrade, newEmail);
                    break;
                case 5:
                    System.out.print("Enter Student ID to Delete: ");
                    sms.deleteStudent(sc.nextInt());
                    break;
                case 6:
                    System.out.print("Sort by (name/age): ");
                    sms.sortStudents(sc.next());
                    break;
                case 7:
                    System.out.print("Enter Grade: ");
                    sms.filterByGrade(sc.next());
                    break;
                case 8:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}