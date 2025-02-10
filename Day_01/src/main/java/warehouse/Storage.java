package warehouse;
import java.util.ArrayList;
import java.util.List;
public class Storage<T extends WarehouseItem> {
    private List<T> items;

    public Storage() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    // Wildcard method to display all items
    public void displayItems(List<? extends WarehouseItem> itemList) {
        for (WarehouseItem item : itemList) {
            System.out.println(item);
        }
    }
}

