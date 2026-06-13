public class JUnitBasics {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public boolean isEven(int n) {
        return n % 2 == 0;
    }

    public String greet(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        return "Hello, " + name;
    }

    public static void main(String[] args) {
        JUnitBasics calc = new JUnitBasics();
        System.out.println("Add: " + calc.add(5, 3));
        System.out.println("Subtract: " + calc.subtract(5, 3));
        System.out.println("Is 4 even: " + calc.isEven(4));
        System.out.println("Greet: " + calc.greet("Sumiran"));
    }
}
