package Day_a_One;

import java.util.Scanner;

public class Arithmetic_operator
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int sum=n+m;
        int sub=n-m;
        int mul=n*m;
        int div=n/m;
        int modulo=n%m;
        System.out.println("Sum : "+ sum);
        System.out.println("Sub : "+ sub);
        System.out.println("mul : "+ mul);
        System.out.println("div : "+ div);
        System.out.println("mudulo : "+ modulo);

    }
}
