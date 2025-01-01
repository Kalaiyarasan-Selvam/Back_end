//Create a class Employee with attributes id, name, and salary. Use the this keyword
// to resolve naming conflicts between local variables and instance variables

package Day_b_two.method_Overloading;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id; // Resolving conflict between local and instance variable
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + this.id);
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: " + this.salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee(101, "Alice", 75000.0);
        emp.displayDetails();
    }
}
