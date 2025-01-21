package Day_n_Fifteen;

import java.util.*;

public class StudentNameTransformation {
    public static List<String> transformNames(List<String> names) {
        List<String> result = new ArrayList<>();
        for (String name : names) {
            result.add("Student: " + name.toUpperCase());
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> studentNames = Arrays.asList("kalai", "tamil", "selvam", "valli");
        List<String> transformedNames = transformNames(studentNames);

        for (String name : transformedNames) {
            System.out.println(name);
        }
    }
}
