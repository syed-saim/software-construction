package fig2;

public class Robot implements Driver {
    @Override
    public void navigate(String destination) {
        System.out.println("[Robot] Calculating optimal route to " + destination);
    }
}
