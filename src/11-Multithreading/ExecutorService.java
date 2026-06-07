import java.util.concurrent.*;
public class ExecutorService {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        java.util.concurrent.ExecutorService executor =
                Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId +
                        " executed by " + Thread.currentThread().getName());
            });
        }
        java.util.concurrent.ExecutorService executor2 =
                Executors.newSingleThreadExecutor();
        Future<Integer> future = executor2.submit(() -> {
            Thread.sleep(100);
            return 42;
        });
        System.out.println("Future result: " + future.get());
        executor.shutdown();
        executor2.shutdown();
        System.out.println("All tasks completed");
    }
}
