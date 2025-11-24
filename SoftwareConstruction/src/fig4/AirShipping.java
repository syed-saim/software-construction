package fig4;
import java.time.LocalDate;

public class AirShipping implements Shipping {

    @Override
    public double getCost(Order order) {
        // Simple rule: $3 per kilogram
        return order.getTotalWeight() * 3.0;
    }

    @Override
    public LocalDate getDate(Order order) {
        // Air is faster: 2 days
        return LocalDate.now().plusDays(2);
    }
}