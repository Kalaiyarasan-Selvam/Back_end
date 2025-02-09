package MiniProject;

public class StudentAdmin {
    public static void main(String[] args) {
        InternalStudentManagementSystem system = new InternalStudentManagementSystem();
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (true) {
            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Sort Students");
            System.out.println("6. Filter By Grade");
            System.out.println("7.Update student  ");
            System.out.println("8.exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> system.addStudent();
                case 2 -> system.viewStudents();
                case 3 -> system.searchStudent();
                case 4 -> system.deleteStudent();
                case 5 -> system.sortStudents();
                case 6->system.filterByGrade();
                case 7-> system.updateStudent();
                case 8-> {
                    System.out.println("Exiting... Thank you!");
                    return;
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
