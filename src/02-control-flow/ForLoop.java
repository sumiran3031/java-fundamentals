public class ForLoop {
    public static void main(String[] args) {
        // basic for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }

        // multiplication table
        int num = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}