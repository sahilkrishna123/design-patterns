package FactoryMethodDesignPattern;

// These classes override the factory method to return a specific type of transport.

public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship(); // Creates a Ship object.
    }
}
