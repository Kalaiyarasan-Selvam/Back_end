package Day_h_nine;

import java.util.ArrayList;
import java.util.Collections;

public class Minimum_ArrayList
{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(34);
        numbers.add(12);
        numbers.add(56);
        numbers.add(7);
        numbers.add(89);

        Collections.sort(numbers);
        System.out.println("maximum Number in ArrayList : "+numbers.get(numbers.size()-1));
    }
}
