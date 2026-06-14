public class StackImpl {
    static class MyStack {
        private int[] arr;
        private int top;
        private int capacity;

        MyStack(int capacity) {
            this.capacity = capacity;
            arr = new int[capacity];
            top = -1;
        }

        void push(int data) {
            if (isFull()) throw new RuntimeException("Stack Overflow!");
            arr[++top] = data;
        }

        int pop() {
            if (isEmpty()) throw new RuntimeException("Stack Underflow!");
            return arr[top--];
        }

        int peek() {
            if (isEmpty()) throw new RuntimeException("Stack is empty!");
            return arr[top];
        }

        boolean isEmpty() { return top == -1; }
        boolean isFull() { return top == capacity - 1; }
        int size() { return top + 1; }

        void print() {
            System.out.print("Stack (top→bottom): ");
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i]);
                if (i > 0) System.out.print(" → ");
            }
            System.out.println();
        }
    }

    static boolean isBalanced(String expr) {
        MyStack stack = new MyStack(expr.length());
        for (char c : expr.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) return false;
                char top = (char) stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.print();

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        stack.print();
        System.out.println("Size: " + stack.size());

        System.out.println("Is balanced {[()]}: " + isBalanced("{[()]}"));
        System.out.println("Is balanced {[(]}: " + isBalanced("{[(]}"));
    }
}
