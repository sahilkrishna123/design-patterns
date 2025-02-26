package StrategyDesignPattern;

// The Context maintains a reference to a Strategy object and
// delegates the execution of the algorithm to the strategy.
public class Context {
    private Strategy strategy;

    // Allows the client to set the strategy at runtime.
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    // Executes the algorithm defined by the strategy.
    public int executeStrategy(int a, int b) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy not set.");
        }
        return strategy.execute(a, b);
    }
}
