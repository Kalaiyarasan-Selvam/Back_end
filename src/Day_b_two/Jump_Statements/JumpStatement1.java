//Write a program to print all numbers from 1 to 100,
// skipping multiples of 5 (use continue).

package Day_b_two.Jump_Statements;

public class JumpStatement1
{
    public static void main(String[] args) {
        int n=100;
        for(int i=1;i<=100;i++)
        {
            if(i%5==0)
                continue;
            System.out.print(i+" ");
        }
    }
}
