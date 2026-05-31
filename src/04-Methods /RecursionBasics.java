public class RecursionBasics {
    static void countdown(int n) {
        if (n == 0) {
            System.out.println("Go!");
            return;
        }
        System.out.println(n);
        countdown(n - 1);
    }
    static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }
    public static void main(String[] args) {
        countdown(5);
        System.out.println("Sum 1 to 10: " + sum(10));
    }
}
