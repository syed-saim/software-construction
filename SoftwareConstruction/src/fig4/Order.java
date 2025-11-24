package fig4;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private final List<LineItem> lineItems = new ArrayList<>();
    private Shipping shipping;

    public void addLineItem(LineItem item) {
        lineItems.add(item);
    }

    public double getTotal() {
        return lineItems.stream()
                .mapToDouble(LineItem::getPrice)
                .sum();
    }

    public double getTotalWeight() {
        return lineItems.stream()
                .mapToDouble(LineItem::getWeightKg)
                .sum();
    }

    public void setShippingType(Shipping shipping) {
        this.shipping = shipping;
    }

    public double getShippingCost() {
        if (shipping == null) {
            throw new IllegalStateException("Shipping type is not set");
        }
        return shipping.getCost(this);
    }

    public LocalDate getShippingDate() {
        if (shipping == null) {
            throw new IllegalStateException("Shipping type is not set");
        }
        return shipping.getDate(this);
    }

    @Override
    public String toString() {
        return "Order(total=$" + getTotal() +
                ", weight=" + getTotalWeight() + "kg)";
    }
}