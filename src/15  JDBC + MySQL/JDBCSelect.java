import java.sql.*;

public class JDBCSelect {
    static final String URL  = "jdbc:mysql://localhost:3306/javadb";
    static final String USER = "root";
    static final String PASS = "Sumiran321";

    public static void main(String[] args) {
        String sql = "SELECT * FROM students";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            System.out.println("ID | Name | Age | Course");
            System.out.println("---|------|-----|-------");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getInt("age") + " | " +
                    rs.getString("course")
                );
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        String sql2 = "SELECT * FROM students WHERE course = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql2)) {

            pstmt.setString(1, "Java Full Stack");
            ResultSet rs = pstmt.executeQuery();

            System.out.println("\nJava students:");
            while (rs.next()) {
                System.out.println(rs.getString("name") + " - " + rs.getInt("age"));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
