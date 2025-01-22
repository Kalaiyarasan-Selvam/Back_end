package Day_o_sixteen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 45, 22, 35, 60);
        Predicate<Integer> isEven = num -> num % 2 == 0;
        List<Integer> evenNumbers = filter(numbers, isEven);
        System.out.println(evenNumbers);
    }

    public static List<Integer> filter(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (predicate.test(number)) {
                result.add(number);
            }
        }
        return result;
    }
}
