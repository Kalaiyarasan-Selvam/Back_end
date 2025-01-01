//Write a program to find the factorial of a number using loops
// and arithmetic operators

package Day_b_two.Operators;

import java.util.Scanner;

public class factorial
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int k=scan.nextInt();
        int fact=1;
        while(k!=0)
        {
            fact*=k;
            k--;
        }
        System.out.println(fact);
    }
}
