public class LogicalOperators {
    public static void main(String[] args) {
        boolean a = true, b = false;

        System.out.println("AND (a && b): " + (a && b));
        System.out.println("OR  (a || b): " + (a || b));
        System.out.println("NOT (!a): " + (!a));

        // practical example
        int age = 20;
        boolean hasId = true;
        System.out.println("Can enter: " + (age >= 18 && hasId));
    }
}