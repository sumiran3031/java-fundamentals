public class MethodBasics {
       static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
    static int add(int a, int b) {
        return a + b;
    }
    static void printLine() {
        System.out.println("------------------");
    }

    public static void main(String[] args) {
        greet("Sumiran");
        printLine();
        int result = add(10, 20);
        System.out.println("Sum: " + result);
    }
}
