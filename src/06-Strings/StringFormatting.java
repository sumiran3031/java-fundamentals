public class StringFormatting {
    public static void main(String[] args) {
        String name = "Sumiran";
        int age = 21;
        double gpa = 9.5;
        String formatted = String.format("Name: %s, Age: %d, GPA: %.2f", name, age, gpa);
        System.out.println(formatted);
        System.out.printf("%-10s %5d %8.2f%n", name, age, gpa);
        String result = "Student: %s | Age: %d".formatted(name, age);
        System.out.println(result);
        System.out.printf("%-20s %-10s %-10s%n", "Name", "Age", "GPA");
        System.out.printf("%-20s %-10d %-10.2f%n", name, age, gpa);
    }
}
