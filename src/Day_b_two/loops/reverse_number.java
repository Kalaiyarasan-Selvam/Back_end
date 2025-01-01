//Create a program to reverse a given number.

package Day_b_two.loops;

import java.util.Scanner;

public class reverse_number
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int sum=0;
        while(n!=0)
        {
            int temp=n%10;
            sum=sum*10+temp;
            n=n/10;
        }
        System.out.println(sum);
    }
}
