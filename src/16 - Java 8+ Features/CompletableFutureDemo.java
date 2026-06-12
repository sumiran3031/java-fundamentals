import java.util.concurrent.*;

public class CompletableFutureDemo {
    public static void main(String[] args) throws Exception {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(500); } catch (InterruptedException e) {}
            return "Result from async task";
        });

        System.out.println("Doing other work while waiting...");
        System.out.println(future.get()); // blocks until complete

        CompletableFuture<Integer> chained = CompletableFuture
                .supplyAsync(() -> 10)
                .thenApply(n -> n * 2)
                .thenApply(n -> n + 5);
        System.out.println("Chained result: " + chained.get());

        CompletableFuture.supplyAsync(() -> "Hello")
                .thenAccept(s -> System.out.println("Received: " + s))
                .get();

        CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(() -> 10);
        CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(() -> 20);

        CompletableFuture<Integer> combined = f1.thenCombine(f2, (a, b) -> a + b);
        System.out.println("Combined: " + combined.get());

        CompletableFuture<String> withError = CompletableFuture
                .supplyAsync(() -> {
                    if (true) throw new RuntimeException("Something failed");
                    return "Success";
                })
                .exceptionally(ex -> "Recovered from: " + ex.getMessage());
        System.out.println(withError.get());
    }
}
