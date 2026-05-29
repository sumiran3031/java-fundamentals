public class BreakContinue {
    public static void main(String[] args) {
        // break
        for (int i = 1; i <= 10; i++) {
            if (i == 5) break;
            System.out.println("Break loop: " + i);
        }

        // continue
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;
            System.out.println("Odd number: " + i);
        }
    }
}