package ObserverDesignPattern;

// A simple file class to simulate file operations.
public class MyFile {
    private String name;

    public MyFile(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Simulate writing to the file.
    public void write() {
        System.out.println("MyFile: Writing to file " + name);
    }
}
