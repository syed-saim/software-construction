package fig2;

public class Transport {

    private final Engine engine;
    private final Driver driver;

    public Transport(Engine engine, Driver driver) {
        this.engine = engine;
        this.driver = driver;
    }

    public void deliver(String destination, String cargo) {
        System.out.println("Starting delivery of: " + cargo);
        driver.navigate(destination);
        engine.move();
        System.out.println("Delivery finished.\n");
    }
}
