package Day_p_seventeen.Suppiler;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class CurrentDateAndTime
{
    public static void main(String[] args) {
        Supplier<LocalDateTime> suppiler=()->LocalDateTime.now();

        LocalDateTime dateTime=suppiler.get();
        System.out.println(dateTime);
    }
}
