package Java_Import_And_Packages;
import java.util.Scanner;
import  Java_Import_And_Packages.Shapes.*;
public class AreaofShapes {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        Circle cir=new Circle();
        Rectangle rec=new Rectangle();
        System.out.println("Enter Radius To Calculate Area of Circle:");
        double r=o.nextDouble();
        double CR=cir.CalcArea(r);
        System.out.println("Area of Circle:"+CR);
        System.out.println();
        System.out.println("Enter length and Breadth to Calculate Area of Rectangle:");
        double l=o.nextDouble();
        double b=o.nextDouble();
        double RR=rec.CalcArea(l,b);
        System.out.println("Area of Rectangle:"+RR);
    }
}
