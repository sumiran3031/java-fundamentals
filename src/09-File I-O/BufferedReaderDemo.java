import java.io.*;
public class BufferedReaderDemo {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("students.txt"))) {
            bw.write("Sumiran Paparkar - Java");
            bw.newLine();
            bw.write("Rahul Sharma - Python");
            bw.newLine();
            bw.write("Priya Singh - React");
            System.out.println("Written successfully");
        } catch (IOException e) {
            System.out.println("Write Error: " + e.getMessage());
        }
        try (BufferedReader br = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            System.out.println("Reading file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Read Error: " + e.getMessage());
        }
    }
}
