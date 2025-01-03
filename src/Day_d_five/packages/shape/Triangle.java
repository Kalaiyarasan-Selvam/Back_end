package Day_d_five.packages.shape;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


public class Triangle
{

    public static void main(String[] args)
    {
        int base=5;
        int height=7;
        double result=sqrt(pow(base,2)+pow(height,2));
        System.out.println(result);
    }
}
