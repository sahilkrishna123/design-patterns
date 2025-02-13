package SingletonDesignPattern;

public class DatabaseConnection {
    // The single instance of DatabaseConnection (lazy initialization)
    private static DatabaseConnection instance;

    // Private constructor prevents instantiation from other classes
    private DatabaseConnection() {
        // Simulate establishing a connection to a database
        System.out.println("Establishing new database connection...");
    }

    // Public method to provide access to the instance
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection(); // Create the instance if it doesn't exist
        }
        return instance;
    }

    // Simulated method to execute a SQL query
    public void query(String sql) {
        System.out.println("Executing SQL: " + sql);
    }
}
