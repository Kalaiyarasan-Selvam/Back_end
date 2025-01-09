package Day_i_Ten;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_Function
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the customer Names");
        String[] str=scan.nextLine().split(",");

        Queue<String> queue=new LinkedList<>(Arrays.asList(str));

        System.out.println("Serve Customer");
        int servenum=scan.nextInt();

        for(int i=0;i<servenum;i++)
        {
            System.out.println("serving :"+ queue.poll());
        }

        System.out.print("Waiting :");
        System.out.print(queue);

    }
}
