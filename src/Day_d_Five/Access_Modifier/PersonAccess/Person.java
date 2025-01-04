package Access_Modifier.PersonAccess;

public class Person {
    public String name;
    protected int age;
    String address;
    private double salary;
    public Person(String name,int age,String address,double salary)
    {
        this.name=name;
        this.age=age;
        this.address=address;
        this.salary=salary;
    }
    public double getSalary() {
        return salary;
    }
}
