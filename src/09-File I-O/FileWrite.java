import java.io.FileWriter;
import java.io.IOException;
public class FileWrite {
    public static void main(String[] args) {
             try (FileWriter fw = new FileWriter("output.txt")) {
            fw.write("Hello, File I/O!\n");
            fw.write("Day 9 - Java Fundamentals\n");
            fw.write("Learning file handling in Java\n");
            System.out.println("File written successfully");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try (FileWriter fw = new FileWriter("output.txt", true)) {
            fw.write("This line is appended\n");
            System.out.println("File appended successfully");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
