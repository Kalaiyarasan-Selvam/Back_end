package Exception;
import java.util.Scanner;
public class Exception_Handling {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        try {
            System.out.print("Enter the first integer:");
            int num1=Integer.parseInt(o.nextLine());
            System.out.print("Enter the second integer:");
            int num2=Integer.parseInt(o.nextLine());
            if (num1<0||num2<0) {
                throw new Exception("Numbers are Not in Range");
            }
            int res=num1/num2;
            System.out.println("Result:"+res);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid integers.");
        }
        catch (Exception e) {
            System.out.println("An unexpected error occurred:"+e.getMessage());
        }
        finally {
            System.out.println("Exception Handled Successfully");
        }
    }
}

