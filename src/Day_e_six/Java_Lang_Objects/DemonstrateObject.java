package Java_Lang_Objects;
class Sample
{
    private String name;
    private int age;
    public Sample(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString()
    {
        return "Sample {name:"+name+",age:"+age+"}";
    }
}
public class DemonstrateObject {
    public static void main(String[] args) {
        Sample o=new Sample("kalai",21);
        Class cls=o.getClass();
        System.out.println("Class of Object:"+cls);
        String s=o.toString();
        System.out.println("String:"+s);
    }
}
