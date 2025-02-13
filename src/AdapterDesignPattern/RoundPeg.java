package AdapterDesignPattern;

public class RoundPeg {
    protected double radius;

    public RoundPeg() {
        // Default constructor
    }

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

