package SingletonDesignPattern;

public class Main {
    public static void main(String[] args) {
        // Create repository objects that use the shared DatabaseConnection
        UserRepository userRepo = new UserRepository();
        OrderRepository orderRepo = new OrderRepository();

        // Use repositories to perform database operations
        userRepo.getAllUsers();
        orderRepo.getAllOrders();

        // Verify that both repositories are using the same DatabaseConnection instance
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        if (db1 == db2) {
            System.out.println("Both db1 and db2 are the same instance!");
        } else {
            System.out.println("Different instances exist!");
        }
    }
}
