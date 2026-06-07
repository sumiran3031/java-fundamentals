public class DeadlockDemo {
    static Object lock1 = new Object();
    static Object lock2 = new Object();
    public static void main(String[] args) {
Thread t1 = new Thread(() -> {
            synchronized (lock1) {
                System.out.println("T1: holding lock1, waiting for lock2");
                try { Thread.sleep(100); } 
                catch (InterruptedException e) {}
                synchronized (lock2) {
                    System.out.println("T1: holding lock1 and lock2");
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (lock2) {
                System.out.println("T2: holding lock2, waiting for lock1");
                try { Thread.sleep(100); } 
                catch (InterruptedException e) {}
                synchronized (lock1) {
                    System.out.println("T2: holding lock1 and lock2");
                }
            }
        });
        t1.start();
        t2.start();
        System.out.println("Deadlock demo started - program may hang!");
    }
}
