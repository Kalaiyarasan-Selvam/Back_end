//Create a class Student with attributes like name and age.
// Initialize these attributes using a parameterized constructor.

package Day_b_two.constructors;

class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }


    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        Student student = new Student("Alice", 20);
        student.displayDetails();
    }
}
