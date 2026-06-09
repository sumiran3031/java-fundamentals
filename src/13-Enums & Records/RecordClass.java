public class RecordClass {
    record Person(String name, int age, String city) {}

    record Point(double x, double y) {
        Point {
            if (x < 0 || y < 0) {
                throw new IllegalArgumentException("Coordinates must be positive");
            }
        }

        double distanceTo(Point other) {
            return Math.sqrt(
                Math.pow(this.x - other.x, 2) +
                Math.pow(this.y - other.y, 2)
            );
        }
    }

    record Student(String name, int marks) implements Comparable<Student> {
        public int compareTo(Student other) {
            return Integer.compare(other.marks, this.marks);
        }
    }
    public static void main(String[] args) {
        Person p = new Person("Sumiran", 21, "Pune");
        System.out.println(p);
        System.out.println("Name: " + p.name());
        System.out.println("Age: " + p.age());

        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        System.out.println("Distance: " + p1.distanceTo(p2));
        Person p3 = new Person("Sumiran", 21, "Pune");
        System.out.println("Equals: " + p.equals(p3));
    }
}
