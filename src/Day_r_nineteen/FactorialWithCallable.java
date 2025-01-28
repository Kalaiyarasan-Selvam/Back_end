package Day_r_nineteen;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class FactorialTask implements Callable<Long> {
    private final int number;

    public FactorialTask(int number) {
        this.number = number;
    }

    @Override
    public Long call() throws Exception {
        return calculateFactorial(number);
    }

    private Long calculateFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

public class FactorialWithCallable {
    public static void main(String[] args) {
        int number = 6;

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Long> future = executorService.submit(new FactorialTask(number));

        try {
            Long factorial = future.get();
            System.out.println("Factorial of " + number + " is: " + factorial);
        } catch (Exception e) {
            System.err.println("Error occurred: " + e.getMessage());
        } finally {
            executorService.shutdown();
        }
    }
}

