package TemplateMethodDesignPattern;

public class Application {
    public static void main(String[] args) {
        // The dependency injection method used here is Constructor Injection.
        System.out.println("=== OrcsAI Turn ===");
        GameAI orcsAI = new OrcsAI();
        orcsAI.turn();

        // The dependency injection method used here is Constructor Injection.
        System.out.println("\n=== MonstersAI Turn ===");
        GameAI monstersAI = new MonstersAI();
        monstersAI.turn();
    }
}
