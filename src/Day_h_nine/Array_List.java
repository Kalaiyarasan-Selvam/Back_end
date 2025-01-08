package Day_h_nine;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List
{
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        Scanner scan=new Scanner(System.in);

        System.out.println("no .of .items");
        int size=scan.nextInt();
        for(int i=0;i<size;i++) {
            arr.add(scan.next());
        }

        System.out.println("remove item");
        String remove= scan.next();
        arr.remove(remove);

        System.out.println("Shopping List");
        System.out.println(arr);
    }
}
