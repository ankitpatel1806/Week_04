package warehouse;
public class WareHouseMain {
    public static void main(String[] args) {
        Storage<WarehouseItem> storage = new Storage<>();

        Electronics electronics = new Electronics("Laptop");
        Electronics electronics1 = new Electronics("Phone");
        Electronics electronics2 = new Electronics("Tablet");
        Groceries groceries = new Groceries("Apple");
        Groceries groceries1 = new Groceries("Banana");
        Groceries groceries2 = new Groceries("Orange");
        Furniture furniture = new Furniture("Sofa");
        Furniture furniture1 = new Furniture("Chair");
        Furniture furniture2 = new Furniture("Table");

        storage.addItem(electronics);
        storage.addItem(electronics1);
        storage.addItem(electronics2);
        storage.addItem(groceries);
        storage.addItem(groceries1);
        storage.addItem(groceries2);
        storage.addItem(furniture);
        storage.addItem(furniture1);
        storage.addItem(furniture2);

        storage.displayItems(storage.getItems());
    }
}
