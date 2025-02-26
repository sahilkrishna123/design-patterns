package TemplateMethodDesignPattern;

// (Concrete Subclass):
class OrcsAI extends GameAI {

    @Override
    public void buildStructures() {
        System.out.println("OrcsAI: Building structures if resources are available.");
        // Simulate building structures: farm, barracks, and stronghold.
        builtStructures.add(new Structure("Farm"));
        builtStructures.add(new Structure("Barracks"));
        builtStructures.add(new Structure("Stronghold"));
        System.out.println("OrcsAI: Structures built - Farm, Barracks, Stronghold.");
    }

    @Override
    public void buildUnits() {
        System.out.println("OrcsAI: Building units based on available resources.");
        // If no scouts exist, build a peon and add to scouts group.
        if (scouts.isEmpty()) {
            System.out.println("No scouts available, building a peon and adding to scouts group.");
            scouts.add("Peon");
        } else {
            System.out.println("Building grunt and adding to warriors group.");
            warriors.add("Grunt");
        }
    }

    @Override
    public void sendScouts(Position position) {
        if (!scouts.isEmpty()) {
            System.out.println("Sending scouts " + scouts + " to position " + position);
        } else {
            System.out.println("No scouts available to send.");
        }
    }

    @Override
    public void sendWarriors(Position position) {
        // Only attack if there are more than 5 warriors.
        if (warriors.size() > 5) {
            System.out.println("Sending warriors " + warriors + " to attack at position " + position);
        } else {
            System.out.println("Not enough warriors to attack. Warriors available: " + warriors.size());
        }
    }

    // Override closestEnemy to simulate enemy detection.
    @Override
    public Enemy closestEnemy() {
        // For demonstration, assume an enemy is always found.
        return new Enemy(new Position(10, 20));
    }
}
