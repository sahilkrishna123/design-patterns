package FactoryMethodDesignPattern;

// Creator Abstract Class: Logistics

// This abstract class declares the factory method createTransport(),
// which returns a Transport object. It also contains business logic that uses the product,
// in this case the planDelivery() method.


public abstract class Logistics {

    // Factory method: Subclasses will override this to create specific transport.
    public abstract Transport createTransport();

    // Business logic that uses the product.
    public void planDelivery() {
        // Get a Transport object using the factory method.
        Transport transport = createTransport();
        // Use the transport to deliver.
        transport.deliver();
    }
}
