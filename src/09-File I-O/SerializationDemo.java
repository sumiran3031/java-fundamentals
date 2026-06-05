import java.io.*;
class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    int age;
    String course;
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
public String toString() {
        return "Student{name=" + name + ", age=" + age + ", course=" + course + "}";
    }
}
public class SerializationDemo {
    public static void main(String[] args) {
        Student student = new Student("Sumiran", 21, "Java");
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("student.ser"))) {
            oos.writeObject(student);
            System.out.println("Serialized: " + student);
        } catch (IOException e) {
            System.out.println("Serialize Error: " + e.getMessage());
        }
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("student.ser"))) {
            Student s = (Student) ois.readObject();
            System.out.println("Deserialized: " + s);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialize Error: " + e.getMessage());
        }
    }
}
