import java.util.function.*;
public class LambdaBasics {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("Without lambda");
            }
        };
        r1.run();
        Runnable r2 = () -> System.out.println("With lambda");
        r2.run();
        MathOperation add = (a, b) -> a + b;
        MathOperation multiply = (a, b) -> a * b;
        System.out.println("Add: " + add.operate(5, 3));
        System.out.println("Multiply: " + multiply.operate(5, 3));
    }
    interface MathOperation {
        int operate(int a, int b);
    }
}
