class Counter {
    static int count = 0;  
    String name;
    Counter(String name) {
        this.name = name;
        count++;
    }
    static void showCount() {
        System.out.println("Total objects: " + count);
    }
}
public class StaticKeyword {
    public static void main(String[] args) {
        Counter c1 = new Counter("A");
        Counter c2 = new Counter("B");
        Counter c3 = new Counter("C");
        Counter.showCount();
    }
}
