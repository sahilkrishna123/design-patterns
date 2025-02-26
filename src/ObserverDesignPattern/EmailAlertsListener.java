package ObserverDesignPattern;

// A concrete subscriber that sends an email alert.
public class EmailAlertsListener implements EventListener {
    private String email;
    private String message;

    public EmailAlertsListener(String email, String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public void update(String filename) {
        // Simulate sending an email alert.
        System.out.println("EmailAlertsListener: Sending email to " + email + " - " + message.replace("%s", filename));
    }
}
