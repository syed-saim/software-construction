package fig3;
import java.util.List;

public abstract class Company {

    // Factory method that subclasses override
    public abstract List<Employee> getEmployees();

    public void createSoftware() {
        System.out.println("Company is creating software...");
        List<Employee> employees = getEmployees();
        for (Employee employee : employees) {
            employee.doWork();
        }
        System.out.println("Software creation finished.\n");
    }
}