import java.sql.*;

public class JDBCConnection {
    static final String URL = "jdbc:mysql://localhost:3306/javadb";
    static final String USER = "root";
    static final String PASSWORD = "Sumiran321";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Connected to MySQL! ✅");
            System.out.println("Database: " + conn.getCatalog());
            System.out.println("AutoCommit: " + conn.getAutoCommit());

            DatabaseMetaData meta = conn.getMetaData();
            System.out.println("Driver: " + meta.getDriverName());
            System.out.println("Version: " + meta.getDatabaseProductVersion());

        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}
