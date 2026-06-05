import java.io.*;
public class FileNotFoundException {
    public static void main(String[] args) {
      try (BufferedReader br = new BufferedReader(
                new FileReader("nonexistent.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
        File file = new File("output.txt");
        if (file.exists()) {
            System.out.println("File exists: " + file.getName());
            System.out.println("File size: " + file.length() + " bytes");
            System.out.println("Is readable: " + file.canRead());
        } else {
            System.out.println("File does not exist");
        }
    }
}
