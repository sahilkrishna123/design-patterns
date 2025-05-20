package BuilderDesignPattern;

// Builder Design Pattern – Car and Manual Example

// Product 1: Car
class Car {
    private int seats;
    private String engine;
    private boolean tripComputer;
    private boolean gps;

    public void setSeats(int seats) { this.seats = seats; }
    public void setEngine(String engine) { this.engine = engine; }
    public void setTripComputer(boolean tripComputer) { this.tripComputer = tripComputer; }
    public void setGPS(boolean gps) { this.gps = gps; }

    public void showSpecs() {
        System.out.println("🚗 Car Specs:");
        System.out.println("Seats: " + seats);
        System.out.println("Engine: " + engine);
        System.out.println("Trip Computer: " + (tripComputer ? "Installed" : "Not installed"));
        System.out.println("GPS: " + (gps ? "Installed" : "Not installed"));
    }
}

// Product 2: Manual
class Manual {
    private String content = "";

    public void add(String info) {
        content += info + "\n";
    }

    public void showManual() {
        System.out.println("📘 Car Manual:");
        System.out.println(content);
    }
}

// Builder interface
interface Builder {
    void reset();
    void setSeats(int number);
    void setEngine(String engine);
    void setTripComputer(boolean hasTripComputer);
    void setGPS(boolean hasGPS);
}

// ConcreteBuilder1: CarBuilder
class CarBuilder implements Builder {
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    public void reset() {
        this.car = new Car();
    }

    public void setSeats(int number) {
        car.setSeats(number);
    }

    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    public void setTripComputer(boolean hasTripComputer) {
        car.setTripComputer(hasTripComputer);
    }

    public void setGPS(boolean hasGPS) {
        car.setGPS(hasGPS);
    }

    public Car getProduct() {
        Car product = this.car;
        this.reset();
        return product;
    }
}

// ConcreteBuilder2: CarManualBuilder
class CarManualBuilder implements Builder {
    private Manual manual;

    public CarManualBuilder() {
        this.reset();
    }

    public void reset() {
        this.manual = new Manual();
    }

    public void setSeats(int number) {
        manual.add("Instruction: Set " + number + " seats.");
    }

    public void setEngine(String engine) {
        manual.add("Instruction: Use engine - " + engine + ".");
    }

    public void setTripComputer(boolean hasTripComputer) {
        manual.add("Instruction: " + (hasTripComputer ? "Install" : "Don't install") + " trip computer.");
    }

    public void setGPS(boolean hasGPS) {
        manual.add("Instruction: " + (hasGPS ? "Install" : "Don't install") + " GPS.");
    }

    public Manual getProduct() {
        Manual result = this.manual;
        this.reset();
        return result;
    }
}

// Director
class Director {
    public void constructSportsCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("SportEngine");
        builder.setTripComputer(true);
        builder.setGPS(true);
    }

    public void constructSUV(Builder builder) {
        builder.reset();
        builder.setSeats(5);
        builder.setEngine("SUVEngine");
        builder.setTripComputer(false);
        builder.setGPS(true);
    }
}

// Client Application
public class CompleteApplication {
    public static void main(String[] args) {
        Director director = new Director();

        // Build a Sports Car
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportsCar(carBuilder);
        Car sportsCar = carBuilder.getProduct();
        sportsCar.showSpecs();

        System.out.println();

        // Build Manual for Sports Car
        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual sportsCarManual = manualBuilder.getProduct();
        sportsCarManual.showManual();
    }
}
