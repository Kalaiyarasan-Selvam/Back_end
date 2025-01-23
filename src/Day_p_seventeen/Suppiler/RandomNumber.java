package Day_p_seventeen.Suppiler;

import java.util.function.Supplier;
import java.util.*;
public class RandomNumber
{
    public static void main(String[] args) {
        Random random = new Random();

        Supplier<Integer> supplier=()->random.nextInt(101);
        for(int i=0;i<5;i++)
        System.out.println(supplier.get());


    }
}
