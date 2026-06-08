public class GenericStack<T> {
    private Object[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    GenericStack() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }
    void push(T item) {
        if (size == elements.length) {
            throw new RuntimeException("Stack is full");
        }
        elements[size++] = item;
    }
    @SuppressWarnings("unchecked")
    T pop() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        T item = (T) elements[--size];
        elements[size] = null;
        return item;
    }
    @SuppressWarnings("unchecked")
    T peek() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        return (T) elements[size - 1];
    }
    boolean isEmpty() { return size == 0; }
    int size() { return size; }
    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        System.out.println("Peek: " + intStack.peek());
        System.out.println("Pop: " + intStack.pop());
        System.out.println("Size: " + intStack.size());
        GenericStack<String> strStack = new GenericStack<>();
        strStack.push("Java");
        strStack.push("Spring");
        System.out.println("String pop: " + strStack.pop());
    }
}
