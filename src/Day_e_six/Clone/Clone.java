package Clone;
class Student implements Cloneable{
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
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    @Override
    public String toString()
    {
        return "{name:"+name+",age:"+age+"}";
    }
}
public class Clone {
    public static void main(String[] args) {
        try {
            Student s = new Student("kalai", 21);
            System.out.println("Original:" + s.toString());
            Student c = (Student) s.clone();
            System.out.println("Clone:"+c.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
