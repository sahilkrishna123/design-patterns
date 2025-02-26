package StrategyDesignPattern;

// Concrete strategy for addition
public class ConcreteStrategyAdd implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}
