package Day_d_five.AccessModifiers.package2;


import Day_d_five.AccessModifiers.package1.Person;

public class TestAccess {
    public static void main(String[] args) {
        Person person = new Person("John", 30, "123 Street", 50000);

        System.out.println("Name: " + person.name); // Accessible (public)
        // System.out.println("Age: " + person.age); // Not accessible (protected in a different package)
        // System.out.println("Address: " + person.address); // Not accessible (default not visible in different package)
        // System.out.println("Salary: " + person.salary); // Not accessible (private)
        System.out.println("Salary: " + person.getSalary()); // Access through public getter
    }
}

