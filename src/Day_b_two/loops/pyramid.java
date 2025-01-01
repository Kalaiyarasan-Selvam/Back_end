//Write a program to print a pyramid pattern using nested loops.

package Day_b_two.loops;

public class pyramid
{
    public static void main(String[] args)
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int k=1;k<n-i;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
