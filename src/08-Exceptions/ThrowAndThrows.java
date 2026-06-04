public class ThrowAndThrows {
    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
    static void processInput(String input, int index)
            throws NumberFormatException, ArrayIndexOutOfBoundsException {
        int[] arr = new int[5];
        arr[index] = Integer.parseInt(input);
        System.out.println("Stored: " + arr[index]);
    }
    public static void main(String[] args) {
        try {
            System.out.println(divide(10, 2));
            System.out.println(divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            processInput("42", 2);
            processInput("abc", 2);
        } catch (NumberFormatException e) {
            System.out.println("Format Error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index Error: " + e.getMessage());
        }
    }
}
