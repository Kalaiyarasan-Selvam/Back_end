package Day_d_Five.Access_Modifier;
import Access_Modifier.PersonAccess.*;
public class TestAccess {
    public static void main(String[] args) {
        Employee e=new Employee("Mani",21,"Bhavani",50000);
        System.out.println("Access in Subclass");
        e.Display();
        System.out.println();
        System.out.println("Access in other Package");
        System.out.println("Name:"+e.name);
        //System.out.println("Age:"+e.age);Protected Can't Accessed
        //System.out.println("Address:"+e.address);Default Can't Accessed
        //System.out.println("Salary:"+e.salary);//Private Can't Accessed
        System.out.println("Salary:"+e.getSalary());//Private can Accessed with Getter
    }
}
