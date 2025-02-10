package marketplace;
public class GadgetCategory {
    private String brand;

    public GadgetCategory(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Gadget Brand: " + brand;
    }
}

