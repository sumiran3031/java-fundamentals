public class QueueImpl {
    static class MyQueue {
        private int[] arr;
        private int front, rear, size, capacity;

        MyQueue(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            front = 0;
            rear = -1;
            size = 0;
        }

        void enqueue(int data) {
            if (isFull()) throw new RuntimeException("Queue is full!");
            rear = (rear + 1) % capacity; // circular
            arr[rear] = data;
            size++;
        }

        int dequeue() {
            if (isEmpty()) throw new RuntimeException("Queue is empty!");
            int data = arr[front];
            front = (front + 1) % capacity;
            size--;
            return data;
        }

        int peek() {
            if (isEmpty()) throw new RuntimeException("Queue is empty!");
            return arr[front];
        }

        boolean isEmpty() { return size == 0; }
        boolean isFull() { return size == capacity; }
        int size() { return size; }

        void print() {
            System.out.print("Queue (front→rear): ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[(front + i) % capacity]);
                if (i < size - 1) System.out.print(" → ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.print();

        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeue: " + queue.dequeue());
        queue.print();
        System.out.println("Size: " + queue.size());

        queue.enqueue(50);
        queue.enqueue(60);
        queue.print();
    }
}
