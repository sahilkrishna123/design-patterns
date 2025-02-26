package ObserverDesignPattern;

// A concrete subscriber that logs events to a log file.
public class LoggingListener implements EventListener {
    private String log;
    private String message;

    public LoggingListener(String log, String message) {
        this.log = log;
        this.message = message;
    }

    @Override
    public void update(String filename) {
        // Simulate writing to a log file.
        System.out.println("LoggingListener: Logging to " + log + " - " + message.replace("%s", filename));
    }
}
