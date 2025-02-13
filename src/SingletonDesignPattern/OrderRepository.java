package SingletonDesignPattern;

public class OrderRepository {
    public void getAllOrders() {
        // Get the singleton DatabaseConnection instance
        DatabaseConnection db = DatabaseConnection.getInstance();

        // Simulate a query to fetch all orders
        db.query("SELECT * FROM Orders");
        System.out.println("Fetching all orders...");
    }
}
