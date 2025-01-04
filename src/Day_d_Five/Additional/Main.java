package Additional;
import Additional.Utilities.Container;
public class Main {
    public static void main(String[] args) {
        Container<Integer> a=new Container<>(45);
        System.out.println("Integer:"+a);//Autoboxing
        Container<String> s=new Container<>("Core Java");
        System.out.println("String:"+s);//String Object
        Priority level=Priority.High;
        System.out.println("Priority Level:"+level);//Uses Enum
        s.setValue("Backend");
        System.out.println("Updated String:"+s);//Modified by Method
    }
}
