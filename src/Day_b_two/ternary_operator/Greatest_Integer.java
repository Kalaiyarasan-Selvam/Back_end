//Write a program to find the largest of three numbers using the ternary operator.

package Day_b_two.ternary_operator;

import java.util.Scanner;

public class Greatest_Integer
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a= scan.nextByte();
        int b= scan.nextInt();
        int c= scan.nextInt();

        int d=(a>b)? (a>c?a:c) : (b>c?b:c);
        System.out.println("greatest"+d);
    }
}
