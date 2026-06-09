public class SealedClass {
    sealed interface Shape permits Circle, Rectangle, Triangle {}

    record Circle(double radius) implements Shape {
        double area() {
            return Math.PI * radius * radius;
        }
    }
    record Rectangle(double width, double height) implements Shape {
        double area() {
            return width * height;
        }
    }
    record Triangle(double base, double height) implements Shape {
        double area() {
            return 0.5 * base * height;
        }
    }
    static double getArea(Shape shape) {
        return switch (shape) {
            case Circle c -> c.area();
            case Rectangle r -> r.area();
            case Triangle t -> t.area();
        };
    }
    static String describe(Shape shape) {
        return switch (shape) {
            case Circle c -> "Circle with radius " + c.radius();
            case Rectangle r -> "Rectangle " + r.width() + "x" + r.height();
            case Triangle t -> "Triangle base=" + t.base();
        };
    }
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 6),
            new Triangle(3, 8)
        };
        for (Shape shape : shapes) {
            System.out.println(describe(shape));
            System.out.printf("Area: %.2f%n%n", getArea(shape));
        }
    }
}
