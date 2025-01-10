package Day_j_Eleven.Concurrent_Map;
import java.util.concurrent.*;

public class OnlineVotingSystem {

    private static ConcurrentMap<String, Integer> votes = new ConcurrentHashMap<>();

    private static void addCandidate(String candidate) {
        votes.putIfAbsent(candidate, 0);
    }

    private static void handleVote(String candidate) {
        votes.merge(candidate, 1, Integer::sum);
    }

    private static void simulateVotingUsingExecutorService() throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                handleVote("Alice");
                handleVote("Bob");
                handleVote("Alice");
            }
        });

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                handleVote("Alice");
                handleVote("Charlie");
            }
        });

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                handleVote("Bob");
                handleVote("Charlie");
                handleVote("Bob");
            }
        });

        executorService.shutdown();

        if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
            executorService.shutdownNow();
        }
    }

    private static void displayResults() {
        System.out.println("Final vote counts:");
        for (String candidate : votes.keySet()) {
            System.out.println(candidate + ": " + votes.get(candidate) + " votes");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        addCandidate("Alice");
        addCandidate("Bob");
        addCandidate("Charlie");

        simulateVotingUsingExecutorService();

        displayResults();
    }
}

