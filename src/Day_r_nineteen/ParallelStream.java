package Day_r_nineteen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStream
{
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

       Arrays.stream(array).parallel().filter(n->n>50).limit(10).map(n->n*n).forEachOrdered(System.out::println);

    }
}
