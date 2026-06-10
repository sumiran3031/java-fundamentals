public class SingletonPattern {
        static class DatabaseConnection {
        private static volatile DatabaseConnection instance;
        private String url;
        private int connectionCount;

        private DatabaseConnection() {
            this.url = "jdbc:mysql://localhost:3306/mydb";
            this.connectionCount = 0;
            System.out.println("Database connection created");
        }

        public static DatabaseConnection getInstance() {
            if (instance == null) {
                synchronized (DatabaseConnection.class) {
                    if (instance == null) {
                        instance = new DatabaseConnection();
                    }
                }
            }
            return instance;
        }

        public void connect() {
            connectionCount++;
            System.out.println("Connected to: " + url + " | Count: " + connectionCount);
        }

        public String getUrl() { return url; }
    }

    public static void main(String[] args) {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        DatabaseConnection db3 = DatabaseConnection.getInstance();

        db1.connect();
        db2.connect();

        System.out.println("Same instance: " + (db1 == db2));
        System.out.println("Same instance: " + (db2 == db3));
    }
}
