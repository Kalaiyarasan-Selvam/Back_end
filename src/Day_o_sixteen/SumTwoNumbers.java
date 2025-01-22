package Day_o_sixteen;

import java.util.function.BiConsumer;

public class SumTwoNumbers {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 5;

        BiConsumer<Integer, Integer> printSum = (a, b) ->
                System.out.println("Sum of " + a + " and " + b + " is " + (a + b));

        printSum.accept(num1, num2);
    }
}
