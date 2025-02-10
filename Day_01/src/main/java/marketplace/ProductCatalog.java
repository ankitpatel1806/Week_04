package marketplace;
import java.util.ArrayList;
import java.util.List;

public class ProductCatalog<T extends Product<?>> {
    private List<T> products;

    public ProductCatalog() {
        products = new ArrayList<>();
    }

    public void addProduct(T product) {
        products.add(product);
    }

    public List<T> getProducts() {
        return products;
    }

    // Generic method to apply discount to a product
    public <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double newPrice = product.getPrice() - (product.getPrice() * percentage / 100);
        product.setPrice(newPrice);
    }

    public void displayProducts() {
        for (T product : products) {
            System.out.println(product);
        }
    }
}
