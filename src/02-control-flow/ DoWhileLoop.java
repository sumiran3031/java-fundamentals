public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println("i = " + i);
            i++;
        } while (i <= 5);

        // runs at least once even if condition false
        int x = 10;
        do {
            System.out.println("This runs once: " + x);
        } while (x < 5);
    }
}