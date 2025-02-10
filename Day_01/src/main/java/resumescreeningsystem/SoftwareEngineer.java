package resumescreeningsystem;
// Concrete class for Software Engineer role
public class SoftwareEngineer extends JobRole {

    public SoftwareEngineer(String name, String description) {
        super(name, description);
    }

    @Override
    public void displayRoleDetails() {
        System.out.println("Software Engineer: " + getName() + "\nDescription: " + getDescription());
    }
}

