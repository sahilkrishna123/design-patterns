package TemplateMethodDesignPattern;

// A simple class representing a game structure.
class Structure {
    private String name;

    public Structure(String name) {
        this.name = name;
    }

    public void collect() {
        System.out.println("Collecting resources from " + name);
    }
}

// A simple class representing a position in the game world.
class Position {
    private int x, y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

// A simple class representing an enemy with a position.
class Enemy {
    private Position position;

    public Enemy(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }
}
