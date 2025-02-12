package shoppingcart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    private ShoppingCart shoppingCart;

    @BeforeEach
    void setUp() {
        shoppingCart = new ShoppingCart();
        shoppingCart.addProductPrice("Apple", 50);
        shoppingCart.addProductPrice("Banana", 45);
        shoppingCart.addProductPrice("Cherry", 450);
    }

    @Test
    void testAddProductToCart() {
        shoppingCart.addProductToCart("Apple");
        shoppingCart.addProductToCart("Banana");

        shoppingCart.displayCart();
        shoppingCart.displaySortedByPrice();
    }

    @Test
    void testDisplaySortedByPrice() {
        shoppingCart.addProductToCart("Apple");
        shoppingCart.addProductToCart("Banana");
        shoppingCart.addProductToCart("Cherry");

        shoppingCart.displaySortedByPrice();
    }

    @Test
    void testProductNotAvailable() {
        shoppingCart.addProductToCart("Pineapple");
    }
}

