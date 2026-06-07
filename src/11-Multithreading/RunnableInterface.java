public class RunnableInterface {
    static class PrintTask implements Runnable {
        private String name;
        private int count;

        PrintTask(String name, int count) {
            this.name = name;
            this.count = count;
        }
        public void run() {
            for (int i = 1; i <= count; i++) {
                System.out.println(name + " - count: " + i);
                try {
                    Thread.sleep(100); // pause 100ms
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new PrintTask("Task A", 3));
        Thread t2 = new Thread(new PrintTask("Task B", 3));
        t1.start();
        t2.start();
        t1.join(); 
        t2.join(); 
        System.out.println("Both tasks completed");
    }
}
