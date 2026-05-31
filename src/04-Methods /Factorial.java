public class Factorial {
       static long factIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    static long factRecursive(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factRecursive(n - 1);
    }
    public static void main(String[] args) {
        System.out.println("Factorial 5 (iterative): " + factIterative(5));
        System.out.println("Factorial 5 (recursive): " + factRecursive(5));
    }
}
