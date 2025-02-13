package SingletonDesignPattern;

public class UserRepository {
    public void getAllUsers() {
        // Get the singleton DatabaseConnection instance
        DatabaseConnection db = DatabaseConnection.getInstance();

        // Simulate a query to fetch all users
        db.query("SELECT * FROM Users");
        System.out.println("Fetching all users...");
    }
}
