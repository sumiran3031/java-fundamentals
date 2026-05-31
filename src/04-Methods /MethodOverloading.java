public class MethodOverloading {
    static int multiply(int a, int b) {
        return a * b;
    }
    static double multiply(double a, double b) {
        return a * b;
    }
    static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    public static void main(String[] args) {
        System.out.println("int multiply: " + multiply(2, 3));
        System.out.println("double multiply: " + multiply(2.5, 3.5));
        System.out.println("three int multiply: " + multiply(2, 3, 4));
    }
}
