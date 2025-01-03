package Day_d_five.AccessModifiers.package1;


public class Employee extends Person {
    public Employee(String name, int age, String address, double salary) {
        super(name, age, address, salary);
    }

    public void displayEmployeeInfo() {
        System.out.println("Name: " + name); // Accessible (public)
        System.out.println("Age: " + age);   // Accessible (protected)
        System.out.println("Address: " + address); // Accessible (default within the same package)
        // System.out.println("Salary: " + salary); // Not accessible (private)
        System.out.println("Salary: " + getSalary()); // Access through public getter
    }
}
