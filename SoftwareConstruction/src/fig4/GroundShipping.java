package fig4;
import java.time.LocalDate;

public class GroundShipping implements Shipping {

    @Override
    public double getCost(Order order) {
        // Example based on the note in the diagram:
        // Free if total > 100, else max(10, 1.5 * totalWeight)
        double total = order.getTotal();
        if (total > 100) {
            return 0.0;
        }
        double cost = order.getTotalWeight() * 1.5;
        return Math.max(10.0, cost);
    }

    @Override
    public LocalDate getDate(Order order) {
        // Suppose ground shipping takes 5 days
        return LocalDate.now().plusDays(5);
    }
}