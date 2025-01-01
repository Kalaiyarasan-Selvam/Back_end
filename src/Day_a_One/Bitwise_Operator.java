package Day_a_One;

import java.util.Scanner;

public class Bitwise_Operator
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int k= scan.nextInt();
        int left=k<<2;
        int right=k>>2;
        int xor=left^right;
        System.out.println("left shift "+left);
        System.out.println("right shift "+right);
        System.out.println("Xor "+xor);

    }
}
