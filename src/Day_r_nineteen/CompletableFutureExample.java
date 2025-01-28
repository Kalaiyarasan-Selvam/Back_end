package Day_r_nineteen;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureExample {
    public static void main(String[] args) {
        CompletableFuture<String> fetchUserData = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "User: John Doe";
        });

        CompletableFuture<String> fetchUserOrders = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "Orders: [Laptop, Phone, Headphones]";
        });

        CompletableFuture<String> combinedResult = fetchUserData.thenCombine(fetchUserOrders, (userData, userOrders) -> {
            return userData + "\n" + userOrders;
        });

        try {
            System.out.println(combinedResult.get());
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

