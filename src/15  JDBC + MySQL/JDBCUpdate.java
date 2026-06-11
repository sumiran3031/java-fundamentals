import java.sql.*;

public class JDBCUpdate {
    static final String URL  = "jdbc:mysql://localhost:3306/javadb";
    static final String USER = "root";
    static final String PASS = "Sumiran321";

    public static void main(String[] args) {
        String sql = "UPDATE students SET age = ?, course = ? WHERE name = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, 22);
            pstmt.setString(2, "Spring Boot");
            pstmt.setString(3, "Sumiran Paparkar");

            int rows = pstmt.executeUpdate();
            System.out.println("Updated rows: " + rows);

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        String verify = "SELECT * FROM students WHERE name = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(verify)) {

            pstmt.setString(1, "Sumiran Paparkar");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println("Updated: " +
                    rs.getString("name") + " | " +
                    rs.getInt("age") + " | " +
                    rs.getString("course")
                );
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
