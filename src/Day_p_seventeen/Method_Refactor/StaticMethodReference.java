package Day_p_seventeen.Method_Refactor;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleFunction;

public class StaticMethodReference
{
    public StaticMethodReference()
    {
        List<Double> numbers = Arrays.asList(4.0, 16.0, 25.0, 36.0, 49.0);

        DoubleFunction<Double> doubleDoubleFunction=StaticMethodReference::square;

        numbers.forEach(i->{
            System.out.println("Square Root of "+i+" is "+doubleDoubleFunction.apply(i));
        });


    }
    public static Double square(Double d) {
        return Math.sqrt(d);

    }
    public static void main(String[] args) {
        StaticMethodReference statics=new StaticMethodReference();
    }
}
