package StrategyDesignPattern;

// Concrete strategy for multiplication
public class ConcreteStrategyMultiply implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}

