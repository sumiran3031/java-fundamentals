import java.sql.*;

public class JDBCDelete {
    static final String URL  = "jdbc:mysql://localhost:3306/javadb";
    static final String USER = "root";
    static final String PASS = "Sumiran321";

    public static void main(String[] args) {
        String sql = "DELETE FROM students WHERE name = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, "Amit Kumar");
            int rows = pstmt.executeUpdate();
            System.out.println("Deleted rows: " + rows);

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        String count = "SELECT COUNT(*) as total FROM students";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(count)) {

            if (rs.next()) {
                System.out.println("Remaining students: " + rs.getInt("total"));
            }

        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
