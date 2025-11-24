package fig2;

public class Fig2Demo {
    public static void main(String[] args) {
        Transport truck = new Transport(new CombustionEngine(), new Human());
        truck.deliver("Warehouse A", "Food Supplies");

        Transport drone = new Transport(new ElectricEngine(), new Robot());
        drone.deliver("Customer Home", "Small Package");
    }
}