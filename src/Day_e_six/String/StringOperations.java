package String;
import java.util.Scanner;
public class StringOperations {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        System.out.print("Enter the first string:");
        String s1=o.nextLine();
        System.out.print("Enter the second string:");
        String s2=o.nextLine();
        int res=s1.compareTo(s2);
        if(res<0) {
            System.out.println("The first string is lexicographically less than the second string.");
        } else if(res>0) {
            System.out.println("The first string is lexicographically greater than the second string.");
        } else {
            System.out.println("The first string is lexicographically equal to the second string.");
        }
        boolean CaseSensitive=s1.equals(s2);
        System.out.println("The two strings are equal (case-sensitive):"+CaseSensitive);
        boolean CaseInsensitive=s1.equalsIgnoreCase(s2);
        System.out.println("The two strings are equal (case-insensitive):"+CaseInsensitive);
        String concat=s1+s2;
        System.out.println("Concatenated string:"+concat);
    }
}

