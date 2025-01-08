package Day_h_nine;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_ArrayList
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("size");
        int size=scanner.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        System.out.println("Enter Elements");
        for(int i=0;i<size;i++) {

        arr.add(scanner.nextInt());
        }

        System.out.println(arr.reversed());
    }
}
