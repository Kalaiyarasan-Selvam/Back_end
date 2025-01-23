package Day_p_seventeen.unaryAndBinaryOperator;

import Day_b_two.Bitwise_operator.BinaryCount;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Add_Numbers
{
    public static void main(String[] args) {
        IntBinaryOperator add=(a,b)-> Math.max(a,b);
        System.out.println(add.applyAsInt(2,3));
        
    }
}
