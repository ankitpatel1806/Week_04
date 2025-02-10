package warehouse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StorageTest {
    private Storage<WarehouseItem> storage;

    @BeforeEach // JUnit 5 equivalent of @Before
    public void setUp() {
        storage = new Storage<>();
    }

    @Test // JUnit 5 equivalent of @Test
    public void testAddItem() {
        Electronics electronics = new Electronics("Smartphone");
        storage.addItem(electronics);

        assertEquals(1, storage.getItems().size());
        assertTrue(storage.getItems().get(0) instanceof Electronics);
    }

    @Test // JUnit 5 equivalent of @Test
    public void testDisplayItems() {
        Electronics electronics = new Electronics("Laptop");
        Groceries groceries = new Groceries("Banana");
        Furniture furniture = new Furniture("Table");

        storage.addItem(electronics);
        storage.addItem(groceries);
        storage.addItem(furniture);

        // Assuming System.out is captured during test or manually checking output
        storage.displayItems(storage.getItems());
    }
}
