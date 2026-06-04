public class MultipleExceptions {
    public static void main(String[] args) {
        try {
            String s = "abc";
            int num = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormat Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        }
        try {
            int[] arr = new int[5];
            arr[10] = 50;
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println("Caught: " + e.getMessage());
        }
        String[] inputs = {"10", "abc", "0"};
        for (String input : inputs) {
            try {
                int num = Integer.parseInt(input);
                int result = 100 / num;
                System.out.println("Result: " + result);
            } catch (NumberFormatException e) {
                System.out.println("Not a number: " + input);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero");
            }
        }
    }
}
