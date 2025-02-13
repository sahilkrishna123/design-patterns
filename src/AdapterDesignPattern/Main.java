package AdapterDesignPattern;

// Client Class

public class Main {
    public static void main(String[] args) {
        // Create a round hole with radius 5.
        RoundHole hole = new RoundHole(5);

        // Create a round peg with radius 5.
        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println("Round peg with radius 5 fits round hole: " + hole.fits(roundPeg));

        // Create square pegs.
        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);

        // The following line would not compile because the hole expects a RoundPeg.
        // hole.fits(smallSquarePeg);

        // Use the adapter to make square pegs compatible.
        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

        // Check if the adapted square pegs fit in the round hole.
        System.out.println("Small square peg (width 5) adapter fits round hole: " + hole.fits(smallSquarePegAdapter));
        System.out.println("Large square peg (width 10) adapter fits round hole: " + hole.fits(largeSquarePegAdapter));
    }
}
