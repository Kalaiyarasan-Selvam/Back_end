package Day_a_One;

import java.util.Scanner;

public class  Relational_Operators
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();;
        int m= scan.nextInt();
        if(n>=0&&m>=0)
        {
            System.out.println("both are positive");
            if(n>m)
                System.out.println("first number is greater than second number");
            if(n==0)
                System.out.println("both are equal");
            if(n<m)
                System.out.println("first number is greater than second number");
        }
        else
        {
            if(n<0)
            System.out.println("first is negative");
            else
                System.out.println(" second is negative");
        }
    }
}
