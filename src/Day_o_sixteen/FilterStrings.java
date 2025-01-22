package Day_o_sixteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Avocado", "Cherry");
        char filterLetter = 'A';
        Predicate<String> startsWithLetter = str -> str.startsWith(String.valueOf(filterLetter));
        List<String> filteredStrings = filter(strings, startsWithLetter);
        System.out.println(filteredStrings);
    }

    public static List<String> filter(List<String> strings, Predicate<String> predicate) {
        List<String> result = new ArrayList<>();
        for (String string : strings) {
            if (predicate.test(string)) {
                result.add(string);
            }
        }
        return result;
    }
}


