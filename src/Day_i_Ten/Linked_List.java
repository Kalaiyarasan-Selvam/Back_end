package Day_i_Ten;

import java.util.LinkedList;
import java.util.Scanner;

public class Linked_List
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("No.Of.tasks");
        int size= scan.nextInt();

        LinkedList<String> list=new LinkedList<>();

        scan.nextLine();

        System.out.println("Add Tasks");
        for(int i=0;i<size;i++)
            list.add(scan.nextLine());

        System.out.println("Remove Task");
        String val=scan.nextLine();
        list.remove(val);

        int i=0;
        for(String S:list)
        {
            System.out.println(++i+". "+S);
        }

    }
}
