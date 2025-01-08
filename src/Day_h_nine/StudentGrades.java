package Day_h_nine;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class StudentGrades
{
    public static int highest_grade( Vector<Integer> vect)
    {
        return vect.get(vect.size()-1);

    }
    public static int lowest_grade( Vector<Integer> vect)
    {
        return vect.get(0);
    }
    public static double  average( Vector<Integer> vect)
    {
        double sum=0;
        for(int i:vect)
        {
            sum+=i;
        }
        return sum/(double)vect.size();
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("size");
        int size=scan.nextInt();
        System.out.println("give marks");
        Vector<Integer> vect=new Vector<>();
        for(int i=0;i<size;i++)
        {
            vect.add(scan.nextInt());
        }
        System.out.println("remove element");
        int rem=scan.nextInt();
        vect.remove(rem);
        Collections.sort(vect);
        System.out.println("highest_grade"+" "+highest_grade(vect));
        System.out.println("lowest_grade"+" "+lowest_grade(vect));
        System.out.println("average_grade"+" "+average(vect));
    }
}
