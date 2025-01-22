package Day_o_sixteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StringLengths {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "World", "Java");
        Function<String, Integer> stringLengthFunction = String::length;
        List<Integer> lengths = mapStringsToLengths(strings, stringLengthFunction);
        System.out.println(lengths);
    }
    public static List<Integer> mapStringsToLengths(List<String> strings, Function<String, Integer> function) {
        List<Integer> result = new ArrayList<>();
        for (String string : strings) {
            result.add(function.apply(string));
        }
        return result;
    }
}
