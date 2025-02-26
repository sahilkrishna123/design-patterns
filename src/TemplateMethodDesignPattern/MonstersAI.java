package TemplateMethodDesignPattern;
// (Concrete Subclass):
class MonstersAI extends GameAI {

    // Monsters don't collect resources.
    @Override
    public void collectResources() {
        System.out.println("MonstersAI: Monsters don't collect resources.");
    }

    // Monsters don't build structures.
    @Override
    public void buildStructures() {
        System.out.println("MonstersAI: Monsters don't build structures.");
    }

    // Monsters don't build units.
    @Override
    public void buildUnits() {
        System.out.println("MonstersAI: Monsters don't build units.");
    }

    @Override
    public void sendScouts(Position position) {
        System.out.println("MonstersAI: Monsters don't send scouts.");
    }

    @Override
    public void sendWarriors(Position position) {
        System.out.println("MonstersAI: Monsters don't send warriors.");
    }

    // Optionally, MonstersAI can use the default closestEnemy() (returns null).
}
