package Java_Import_And_Packages;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;
import java.util.Scanner;
public class Hypotenuse {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.println("Enter other Two Sides:");
        double a=o.nextDouble();
        double b=o.nextDouble();
        System.out.println("Hypotenues of Right Angled Triangle:"+sqrt(pow(a,2)+pow(b,2)));
    }
}
