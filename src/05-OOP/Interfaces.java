interface Drawable {
    void draw(); 
}
interface Colorable {
    void fillColor(String color);
}
class Triangle implements Drawable, Colorable {
    @Override
    public void draw() {
        System.out.println("Drawing Triangle.");
    }
    @Override
    public void fillColor(String color) {
        System.out.println("Filling Triangle with " + color);
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.draw();
        t.fillColor("Red");
    }
}
