//Create a program to find the count of 1s
// in the binary representation of a number

package Day_b_two.Bitwise_operator;

import java.util.Scanner;

public class Swaping
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a= scan.nextInt();
        int  b= scan.nextInt();
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);

    }
}
