import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");
        System.out.println("Queue: " + queue);
        System.out.println("Peek: " + queue.peek());   // front element
        System.out.println("Poll: " + queue.poll());   // remove front
        System.out.println("After poll: " + queue);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        System.out.println("PriorityQueue poll order:");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }
}
