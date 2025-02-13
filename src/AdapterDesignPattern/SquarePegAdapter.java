package AdapterDesignPattern;

// Adapter Class coz it's extending already compatible class and wrapping incompatible class

public class SquarePegAdapter extends RoundPeg {
    // The adapter holds an instance of SquarePeg.
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    // The adapter pretends that it's a round peg by providing a getRadius() method.
    // It calculates the minimum radius of a circle that can fit the square peg.
    @Override
    public double getRadius() {
        // Formula: radius = (width * sqrt(2)) / 2
        return peg.getWidth() * Math.sqrt(2) / 2;
    }
}
