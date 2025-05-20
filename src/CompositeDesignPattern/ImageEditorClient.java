package CompositeDesignPattern;
import java.util.*;

// Component Interface
interface Graphic {
    void move(int x, int y);
    void draw();
}

// Leaf Class
class Dot implements Graphic {
    protected int x;
    protected int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void draw() {
        System.out.println("Draw Dot at (" + x + ", " + y + ")");
    }
}

// Extended Leaf - Circle
class Circle extends Dot {
    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle at (" + x + ", " + y + ") with radius " + radius);
    }
}

// Composite Class
class CompoundGraphic implements Graphic {
    private List<Graphic> children = new ArrayList<>();

    public void add(Graphic child) {
        children.add(child);
    }

    public void remove(Graphic child) {
        children.remove(child);
    }

    @Override
    public void move(int x, int y) {
        for (Graphic child : children) {
            child.move(x, y);
        }
    }

    @Override
    public void draw() {
        System.out.println("Draw CompoundGraphic:");
        for (Graphic child : children) {
            child.draw();
        }
        System.out.println("Draw bounding box around CompoundGraphic\n");
    }
}

// Client Class
public class ImageEditorClient {
    private CompoundGraphic all;

    public void load() {
        all = new CompoundGraphic();
        all.add(new Dot(1, 2));
        all.add(new Circle(5, 3, 10));
        // Add more shapes if needed
    }

    public void groupSelected(Graphic[] components) {
        CompoundGraphic group = new CompoundGraphic();
        for (Graphic g : components) {
            group.add(g);
            all.remove(g);
        }
        all.add(group);
    }

    public void drawAll() {
        all.draw();
    }

    public static void main(String[] args) {
        ImageEditorClient editor = new ImageEditorClient();
        editor.load();

        // Simulate grouping selected shapes
        Graphic[] selected = {
                new Dot(10, 20),
                new Circle(15, 25, 5)
        };

        editor.groupSelected(selected);
        editor.drawAll();
    }
}
