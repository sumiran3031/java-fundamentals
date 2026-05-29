public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }

        // sum of digits
        int num = 12345;
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}