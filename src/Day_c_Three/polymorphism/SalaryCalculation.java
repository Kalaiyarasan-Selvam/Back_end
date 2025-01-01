//Write a program with a base class Employee that has a method calculateSalary(). Derive two classes Manager and Developer, and override the calculateSalary()
// method in both to display different salaries.

package Day_c_Three.polymorphism;

class Employee {
    public void calculateSalary() {
        System.out.println("Calculating salary for Employee");
    }
}

class Manager extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("Salary for Manager: $8000");
    }
}

class Developer extends Employee {
    @Override
    public void calculateSalary() {
        System.out.println("Salary for Developer: $5000");
    }
}

public class SalaryCalculation {
    public static void main(String[] args) {
        Employee manager = new Manager();
        Employee developer = new Developer();

        manager.calculateSalary();
        developer.calculateSalary();
    }
}
