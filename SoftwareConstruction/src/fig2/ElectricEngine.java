package fig2;

public class ElectricEngine implements Engine {
    @Override
    public void move() {
        System.out.println("[ElectricEngine] Moving silently with electricity!");
    }
}