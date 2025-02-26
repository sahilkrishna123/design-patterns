package ObserverDesignPattern;

// The concrete publisher containing business logic that notifies subscribers.
public class Editor {
    public EventManager events;
    private MyFile file;

    public Editor() {
        // Initialize EventManager with the events we care about.
        this.events = new EventManager("open", "save");
    }

    // Open a file and notify subscribers that a file was opened.
    public void openFile(String path) {
        System.out.println("Editor: Opening file " + path);
        this.file = new MyFile(path);
        events.notify("open", this.file.getName());
    }

    // Save a file and notify subscribers that a file was saved.
    public void saveFile() {
        if (this.file != null) {
            System.out.println("Editor: Saving file " + this.file.getName());
            this.file.write();
            events.notify("save", this.file.getName());
        }
    }
}
