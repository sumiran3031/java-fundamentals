public class ThreadBasics {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Thread 1: " + i);
                }
            }
        };
        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2: " + i);
            }
        });
        t1.start();
        t2.start();
        System.out.println("Main thread: " + Thread.currentThread().getName());
        System.out.println("T1 state: " + t1.getState());
    }
}
