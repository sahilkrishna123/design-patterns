package FactoryMethodDesignPattern;

// Client Code

public class Main {
    public static void main(String[] args) {
        Logistics logistics;

        // Suppose we decide on the mode of transport based on some runtime condition.
        // Here, we simulate a condition with a simple string.
        String transportType = "sea"; // Change to "road" for truck delivery

        if (transportType.equalsIgnoreCase("sea")) {
            logistics = new SeaLogistics();
        } else {
            logistics = new RoadLogistics();
        }

        // The client calls the business method, which internally uses the factory method.
        logistics.planDelivery();
    }
}

