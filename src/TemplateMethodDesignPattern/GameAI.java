package TemplateMethodDesignPattern;

import java.util.ArrayList;
import java.util.List;

// Abstract GameAI Class
abstract class GameAI {
    // List of built structures.
    protected List<Structure> builtStructures;
    // For OrcsAI: lists of scouts and warriors.
    protected List<String> scouts;
    protected List<String> warriors;

    public GameAI() {
        builtStructures = new ArrayList<>();
        scouts = new ArrayList<>();
        warriors = new ArrayList<>();
    }

    // Template method that defines the skeleton of a turn.
    public final void turn() {
        collectResources();
        buildStructures();
        buildUnits();
        attack();
    }

    // Default implementation for collecting resources.
    public void collectResources() {
        System.out.println("Collecting resources from built structures:");
        for (Structure s : builtStructures) {
            s.collect();
        }
    }

    // Abstract steps to be implemented by subclasses.
    public abstract void buildStructures();
    public abstract void buildUnits();

    // Template method for attack.
    public void attack() {
        Enemy enemy = closestEnemy();
        if (enemy == null) {
            System.out.println("No enemy found. Sending scouts to the center of the map.");
            sendScouts(new Position(0, 0)); // Assume map center is at (0,0)
        } else {
            System.out.println("Enemy found at position " + enemy.getPosition());
            sendWarriors(enemy.getPosition());
        }
    }

    // Abstract methods for sending units.
    public abstract void sendScouts(Position position);
    public abstract void sendWarriors(Position position);

    // A method to find the closest enemy. Default returns null.
    public Enemy closestEnemy() {
        return null; // Base implementation: no enemy by default.
    }
}
