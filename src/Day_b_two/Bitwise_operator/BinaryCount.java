
//Write a program to swap two numbers without
// using a third variable (use XOR).

package Day_b_two.Bitwise_operator;

import java.util.Scanner;

public class BinaryCount
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int k=scan.nextInt();
        String bin=Integer.toBinaryString(k);
        int count=0;
        for(int i=0;i<bin.length();i++)
        {
            if(bin.charAt(i)=='1')
                count++;
        }
        System.out.println(count);
    }
}
