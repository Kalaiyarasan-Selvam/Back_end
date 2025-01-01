package Day_a_One;

import java.util.Scanner;

public class Ternary_Operator
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String val=(n%2==0)?"even":"odd";
        System.out.println(val);
    }
}
