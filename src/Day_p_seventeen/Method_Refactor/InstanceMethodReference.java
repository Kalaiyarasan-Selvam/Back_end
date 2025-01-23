package Day_p_seventeen.Method_Refactor;

import java.util.ArrayList;
import java.util.List;

public class InstanceMethodReference {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Banana");
        strings.add("apple");
        strings.add("Orange");
        strings.add("mango");
        strings.add("Grape");

        strings.sort(String::compareToIgnoreCase);

        strings.forEach(System.out::println);
    }
}
