import java.sql.*;

public class JDBCInsert {
    static final String URL  = "jdbc:mysql://localhost:3306/javadb";
    static final String USER = "root";
    static final String PASS = "Sumiran321";

    public static void main(String[] args) {
        String sql = "INSERT INTO students (name, age, course) VALUES (?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
            PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, "Sumiran Paparkar");
            pstmt.setInt(2, 21);
            pstmt.setString(3, "Java Full Stack");
            int rows = pstmt.executeUpdate();
            System.out.println("Inserted rows: " + rows);
            String[][] students = {
                {"Rahul Sharma", "22", "Python"},
                {"Priya Singh", "20", "React"},
                {"Amit Kumar", "23", "Spring Boot"}
            };

            for (String[] student : students) {
                pstmt.setString(1, student[0]);
                pstmt.setInt(2, Integer.parseInt(student[1]));
                pstmt.setString(3, student[2]);
                pstmt.executeUpdate();
            }
            System.out.println("All students inserted ✅");

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
