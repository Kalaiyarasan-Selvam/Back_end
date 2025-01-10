package Day_j_Eleven.Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Email_validator
{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] email=scanner.nextLine().split(",");
        String regex="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";


        for(String emails:email)
        {
        if( Pattern.matches(regex,emails))
        {
            System.out.println(emails+" : Valid ");
        }
        else
            System.out.println(emails+" : InValid ");
        }
    }
}
