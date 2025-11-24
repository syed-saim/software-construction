package fig2;

public class Human implements Driver {
    @Override
    public void navigate(String destination) {
        System.out.println("[Human] Driving towards " + destination + " using experience.");
    }
}