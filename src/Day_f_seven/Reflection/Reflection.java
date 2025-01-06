package Day_f_seven.Reflection;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class Reflection {
        public static void main(String[] args) {
            try {
                Class cls=Class.forName("Reflection.Person");
                Constructor con[]=cls.getDeclaredConstructors();
                System.out.println("Constructors:");
                for(int i=0;i<con.length;i++)
                {
                    System.out.println(con[i]);
                }
                Method met[]= cls.getDeclaredMethods();
                System.out.println("Methods:");
                for(int i=0;i<met.length;i++)
                {
                    System.out.println(met[i]);
                }
                Field fie[]=cls.getDeclaredFields();
                System.out.println("Fields:");
                for(int i=0;i<fie.length;i++)
                {
                    System.out.println(fie[i]);
                }
                Person p1=(Person)con[1].newInstance("kalai ","Erode","Software Developer");
                for(int i=0;i<met.length;i++)
                {
                    if(met[i].getName().indexOf("getDetails")!=-1)
                    {
                        System.out.println("Person Details:");
                        met[i].invoke(p1);
                    }
                }
                Person p2=(Person)con[0].newInstance("iT");
                for(int i=0;i<met.length;i++)
                {
                    if(met[i].getName().indexOf("getDept")!=-1)
                    {
                        System.out.println("Department:");
                        met[i].setAccessible(true);
                        met[i].invoke(p2);
                    }
                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
    }