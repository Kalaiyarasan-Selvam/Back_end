package Day_i_Ten;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Set
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        LinkedHashSet<String> set=new LinkedHashSet<>();
        System.out.println("Enter names to add to the set (comma-separated):");
        String input = scan.nextLine();
        String[] names = input.split(",");

        for (String name : names) {
            name = name.trim(); // Trim whitespace
            if (set.add(name)) {
                System.out.println("Added: " + name);
            } else {
                System.out.println("Duplicate (not added): " + name);
            }
        }

        System.out.println("Unique Elements");
        System.out.println(set);

    }
}
