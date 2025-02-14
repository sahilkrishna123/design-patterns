package FactoryMethodDesignPattern;

// These classes override the factory method to return a specific type of transport.
public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck(); // Creates a Truck object.
    }
}
