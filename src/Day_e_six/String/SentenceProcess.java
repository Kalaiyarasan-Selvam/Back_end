package String;
import java.util.Scanner;
public class SentenceProcess {
    public static void main(String[] args) {
        Scanner o=new Scanner(System.in);
        String s1=o.nextLine();
        String []slen=s1.split(" ");
        int len=slen.length;
        System.out.println("Number of Words in Sentence :"+len);
        String s2=new StringBuilder(s1).reverse().toString();
        System.out.println("Reversed Sentence :"+s2);
        String s3=s1.replaceAll("[aeiouAEIOU]","*");
        System.out.println("Vowels Replaced by * :"+s3);
    }
}
