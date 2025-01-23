package Day_p_seventeen.unaryAndBinaryOperator;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class ToUppercase
{
    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator=(str)->str.toUpperCase();

        System.out.println(unaryOperator.apply("kalai"));
    }
}
