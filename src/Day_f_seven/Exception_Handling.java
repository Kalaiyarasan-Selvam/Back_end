package Day_f_seven;

import java.util.*;
public class Exception_Handling {
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        try {
            int num1 = obj.nextInt();
            int num2 = obj.nextInt();
            int res=num1/num2;
            System.out.println(res);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error : Division By O is Not Allowded");
        }
        catch (InputMismatchException e)
        {
            System.out.println("Error: Invalid Input");
        }
        catch(Exception e)
        {
            System.out.println("An error Occurres: "+e.getMessage());
        }
    }
}
