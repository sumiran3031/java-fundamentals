public class FinallyBlock {
    public static void main(String[] args) {
        try {
            System.out.println("Try block");
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Catch block");
        } finally {
            System.out.println("Finally block - always runs");
        }
        System.out.println("---");
        try {
            System.out.println("Try block");
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Catch block: " + e.getMessage());
        } finally {
            System.out.println("Finally block - always runs");
        }
    }
}
