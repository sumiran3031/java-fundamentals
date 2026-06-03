import java.util.LinkedList;
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.addFirst("Start");
        ll.addLast("End");
        System.out.println("LinkedList: " + ll);
        System.out.println("First: " + ll.getFirst());
        System.out.println("Last: " + ll.getLast());
        ll.removeFirst();
        ll.removeLast();
        System.out.println("After remove: " + ll);
        ll.offer("X");
        ll.offer("Y");
        System.out.println("Poll: " + ll.poll());
        System.out.println("Peek: " + ll.peek());
    }
}
