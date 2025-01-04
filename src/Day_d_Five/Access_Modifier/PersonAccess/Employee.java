package Day_d_Five.Access_Modifier.PersonAccess;

public class Employee extends Access_Modifier.PersonAccess.Person {
    public Employee(String name,int age,String address,double salary)
    {
        super(name,age,address,salary);
    }
    public void Display()
    {
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Address:"+address);
       //System.out.println("Salary:"+salary); Private Can't Access in subclass
        System.out.println("Salary:"+getSalary());//Private can Accessed with Getter
    }
}
