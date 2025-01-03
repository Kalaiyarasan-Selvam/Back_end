package Day_d_five.AccessModifiers.package1;

// File: Person.java (in package "mypackage")

public class Person {
    public String name; // Public access
    protected int age;  // Protected access
    String address;     // Default (package-private) access
    private double salary; // Private access

    // Constructor
    public Person(String name, int age, String address, double salary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }

    // Getter for private field salary
    public double getSalary() {
        return salary;
    }

    // Setter for private field salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
