//Create a program to check if a number is
// prime using logical operators.

package Day_b_two.Operators;

import java.util.Scanner;

public class prime_number
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int k= scan.nextInt();
        for(int i=2;i<=Math.sqrt(k);i++)
        {
            if(k%i==0) {
                System.out.println("not prime number");
                break;
            }
            if(i==(int)Math.sqrt(k))
                System.out.println("prime number");
        }


    }
}
