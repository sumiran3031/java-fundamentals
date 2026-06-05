import java.io.FileReader;
import java.io.IOException;
public class FileRead {
    public static void main(String[] args) {
       try (FileReader fr = new FileReader("output.txt")) {
            int ch;
            System.out.println("File contents:");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
