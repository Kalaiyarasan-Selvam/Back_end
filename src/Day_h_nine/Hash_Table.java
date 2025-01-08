package Day_h_nine;

import java.util.Hashtable;
import java.util.Scanner;

public class Hash_Table
{
    public static void contactDirect(Hashtable<String,String> hst)
    {
        System.out.println(hst);
    }
    public static void main(String[] args) {
        Hashtable<String,String> hst=new Hashtable<>();
        hst.put("john","986543210");
        hst.put("Bob","912345680");
        hst.put("Alice","8899776655");

        System.out.println("contact Directory" );
        contactDirect(hst);
        Scanner scan=new Scanner(System.in);

        System.out.println("search_for  ");
        String searchfor=scan.next();
        System.out.println(searchfor+":"+hst.get(searchfor));

        System.out.println(" remove contact");
        String remove =scan.next();
        System.out.println(hst.remove(remove));

        System.out.println("After removal");
        contactDirect(hst);
    }
}
