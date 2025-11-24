package fig4;

public class Fig4Demo {
    public static void main(String[] args) {
        Order order = new Order();
        order.addLineItem(new LineItem("Laptop", 900, 2.5));
        order.addLineItem(new LineItem("Mouse", 20, 0.2));

        System.out.println(order);

        // Ground shipping
        order.setShippingType(new GroundShipping());
        System.out.println("Ground shipping cost: $" + order.getShippingCost());
        System.out.println("Estimated ground delivery date: " + order.getShippingDate());

        // Air shipping
        order.setShippingType(new AirShipping());
        System.out.println("Air shipping cost: $" + order.getShippingCost());
        System.out.println("Estimated air delivery date: " + order.getShippingDate());
    }
}