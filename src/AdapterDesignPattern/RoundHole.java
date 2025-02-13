package AdapterDesignPattern;

public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    // Checks if the provided round peg fits in the hole.
    public boolean fits(RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }
}
