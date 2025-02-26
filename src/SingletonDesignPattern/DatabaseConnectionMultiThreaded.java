package SingletonDesignPattern;

public class DatabaseConnectionMultiThreaded {
    // The volatile keyword ensures that multiple threads handle the instance variable correctly.
    private static volatile DatabaseConnectionMultiThreaded instance;

    // Private constructor prevents instantiation from outside the class.
    private DatabaseConnectionMultiThreaded() {
        // Simulate heavy initialization, e.g., establishing a database connection.
        System.out.println(Thread.currentThread().getName() + ": Initializing Database Connection...");
    }

    // Returns the singleton instance using double-checked locking for thread safety.
    public static DatabaseConnectionMultiThreaded getInstance() {
        if (instance == null) {
            synchronized (DatabaseConnectionMultiThreaded.class) {
                if (instance == null) {
                    instance = new DatabaseConnectionMultiThreaded();
                }
            }
        }
        return instance;
    }

    // Simulated business method.
    public void connect() {
        System.out.println(Thread.currentThread().getName() + ": Connected to database using instance " + instance);
    }
}
