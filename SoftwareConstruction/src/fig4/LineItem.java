package fig4;

public class LineItem {
    private final String description;
    private final double price;
    private final double weightKg;

    public LineItem(String description, double price, double weightKg) {
        this.description = description;
        this.price = price;
        this.weightKg = weightKg;
    }

    public double getPrice() {
        return price;
    }

    public double getWeightKg() {
        return weightKg;
    }

    @Override
    public String toString() {
        return description + " ($" + price + ", " + weightKg + "kg)";
    }
}
