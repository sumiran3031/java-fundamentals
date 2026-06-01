class Car {
    String brand;
    int speed;
    void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}
public class ClassAndObject {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.speed = 120;
        c1.display();
        Car c2 = new Car();
        c2.brand = "Honda";
        c2.speed = 100;
        c2.display();
    }
}
