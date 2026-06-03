import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Stack: " + stack);
        System.out.println("Peek: " + stack.peek());   // top element
        System.out.println("Pop: " + stack.pop());     // remove top
        System.out.println("After pop: " + stack);
        System.out.println("isEmpty: " + stack.isEmpty());
        String brackets = "{[()]}";
        Stack<Character> bracketStack = new Stack<>();
        boolean balanced = true;
        for (char c : brackets.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                bracketStack.push(c);
            } else {
                if (bracketStack.isEmpty()) { balanced = false; break; }
                bracketStack.pop();
            }
        }
        System.out.println("Brackets balanced: " + (balanced && bracketStack.isEmpty()));
    }
}
