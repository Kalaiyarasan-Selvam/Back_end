package Day_d_five.packages;


import Day_d_five.packages.shape.*;

public class Main
{
    public static void main(String[] args) {
        circle cir=new circle();
        Rectangle rec=new Rectangle();

        System.out.println(cir.AreaOfCircle(5));
        System.out.println(rec.AreaOfRectangle(5,10));
    }
}
