package marketplace;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MarketPlaceTest {
    private ProductCatalog<Product<?>> catalog;

    @BeforeEach
    public void setUp() {
        catalog = new ProductCatalog<>();
    }

    @Test
    public void testAddProduct() {
        BookCategory bookCategory = new BookCategory("Manwha");
        Product<BookCategory> book = new Product<>("Solo Leveling", 450, bookCategory) {};
        catalog.addProduct(book);

        assertEquals(1, catalog.getProducts().size());
        assertEquals("Solo Leveling", catalog.getProducts().get(0).getName());
    }

    @Test
    public void testApplyDiscount() {
        GadgetCategory gadgetCategory = new GadgetCategory("Samsung");
        Product<GadgetCategory> gadget = new Product<>("Samsung Galaxy", 15000, gadgetCategory) {};
        catalog.addProduct(gadget);

        catalog.applyDiscount(gadget, 10);
        assertEquals(13500, gadget.getPrice());
    }
}

