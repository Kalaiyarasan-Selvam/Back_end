package Day_n_Fifteen;

import java.util.*;
import java.util.stream.*;

class stud {
    String name;
    String department;
    int marks;

    stud(String name, String department, int marks) {
        this.name = name;
        this.department = department;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " (" + marks + ")";
    }
}

public class TopScorerByDepartment {
    public static void main(String[] args) {
        List<stud> studs = Arrays.asList(
                new stud("Aswin", "CS", 85),
                new stud("Bob", "Mech", 78),
                new stud("Chandru", "CS", 92),
                new stud("David", "Civil", 88),
                new stud("Eval", "Mech", 91),
                new stud("Francise", "Civil", 80)
        );

        Map<String, stud> topScorers = studs.stream()
                .collect(Collectors.groupingBy(
                        stud -> stud.department,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingInt(stud -> stud.marks)),
                                Optional::get
                        )
                ));

        topScorers.forEach((department, stud) ->
                System.out.println("Department: " + department + ", Top Scorer: " + stud));
    }
}
