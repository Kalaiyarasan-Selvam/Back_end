package Day_k_tweleve.Java_nio;

import java.nio.CharBuffer;
import java.nio.IntBuffer;
import java.util.Scanner;

public class NIO_Example {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.println("Enter Capacity of Numbers:");
        int n=o.nextInt();
        IntBuffer ib=IntBuffer.allocate(n);
        System.out.println("Enter the Numbers:");
        for(int i=0;i<n;i++)
        {
            ib.put(o.nextInt());
        }
        ib.flip();
        System.out.println("Current Position:"+ib.position());
        System.out.println("Numbers:");
        while(ib.hasRemaining())
        {
            System.out.println(ib.get());
        }
        System.out.println("Total Capacity:"+ib.capacity());
        System.out.println("---------------------------------");
        System.out.println("Enter the Word:");
        String s=o.next();
        CharBuffer cb=CharBuffer.allocate(256);
        for(char i:s.toCharArray())
        {
            cb.put(i);
        }
        cb.flip();
        System.out.println("Current Position:"+cb.position());
        System.out.println("Characters");
        while(cb.hasRemaining())
        {
            System.out.println(cb.get());
        }
        System.out.println("Total Capacity:"+cb.capacity());
    }
}
