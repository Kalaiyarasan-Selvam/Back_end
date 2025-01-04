package Autoboxing_And_Varargs;
import java.util.ArrayList;
import java.util.List;

public class Autoboxing {
    public static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=5;i++)
            l.add(i);
        int s=0;
        for(int i:l)
            s+=i;
        System.out.println("Sum:"+s);
    }
}
