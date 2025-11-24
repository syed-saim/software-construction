package fig3;

public class Fig3Demo {
    public static void main(String[] args) {
        Company gameDev = new GameDevCompany();
        Company outsourcing = new OutsourcingCompany();

        System.out.println("=== GameDev Company ===");
        gameDev.createSoftware();

        System.out.println("=== Outsourcing Company ===");
        outsourcing.createSoftware();
    }
}