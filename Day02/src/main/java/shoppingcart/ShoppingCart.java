package shoppingcart;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ShoppingCart {

    private Map<String, Double> cart; // Using LinkedHashMap to maintain order
    private Map<String, Double> priceList; // Using HashMap to store product prices

    public ShoppingCart() {
        this.cart = new LinkedHashMap<>();
        this.priceList = new HashMap<>();
    }

    // Add products to the price list
    public void addProductPrice(String product, double price) {
        priceList.put(product, price);
    }

    // Add product to the cart
    public void addProductToCart(String product) {
        if (priceList.containsKey(product)) {
            cart.put(product, priceList.get(product));
        } else {
            System.out.println("Product not available in the price list!");
        }
    }

    // Display the items added to the cart in the order they were added
    public void displayCart() {
        System.out.println("Shopping Cart (Order of addition):");
        for (Map.Entry<String, Double> entry : cart.entrySet()) {
            System.out.println("Product: " + entry.getKey() + " | Price: " + entry.getValue());
        }
    }

    // Display the items sorted by their price
    public void displaySortedByPrice() {
        TreeMap<String, Double> sortedByPrice = new TreeMap<>((p1, p2) -> {
            return priceList.get(p1).compareTo(priceList.get(p2));
        });
        sortedByPrice.putAll(cart);

        System.out.println("\nShopping Cart (Sorted by Price):");
        for (Map.Entry<String, Double> entry : sortedByPrice.entrySet()) {
            System.out.println("Product: " + entry.getKey() + " | Price: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProductPrice("Apple", 50);
        shoppingCart.addProductPrice("Banana", 45);
        shoppingCart.addProductPrice("Cherry", 450);

        shoppingCart.addProductToCart("Apple");
        shoppingCart.addProductToCart("Banana");

        shoppingCart.displayCart();
        shoppingCart.displaySortedByPrice();
    }
}
