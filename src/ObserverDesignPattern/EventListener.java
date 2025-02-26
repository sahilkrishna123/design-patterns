package ObserverDesignPattern;

// The subscriber interface that all observers must implement.
public interface EventListener {
    void update(String filename);
}

