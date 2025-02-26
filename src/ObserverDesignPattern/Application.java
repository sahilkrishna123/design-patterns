package ObserverDesignPattern;

// The client application that configures publishers and subscribers at runtime.
public class Application {
    public static void main(String[] args) {
        Editor editor = new Editor();

        // Create subscribers.
        LoggingListener logger = new LoggingListener("/path/to/log.txt", "Someone has opened the file: %s");
        EmailAlertsListener emailAlerts = new EmailAlertsListener("admin@example.com", "Someone has changed the file: %s");

        // Subscribe the listeners to events.
        editor.events.subscribe("open", logger);
        editor.events.subscribe("save", emailAlerts);

        // Simulate events.
        editor.openFile("test.txt");
        editor.saveFile();
    }
}
