package marketplace;

public class MarketPlaceMain {
    public static void main(String[] args) {
        BookCategory bookCategory = new BookCategory("Manga");
        ClothingCategory clothingCategory = new ClothingCategory("Hoodies");
        GadgetCategory gadgetCategory = new GadgetCategory("Apple");

        Product<BookCategory> book = new Product<>("One Piece", 350, bookCategory) {};
        Product<ClothingCategory> clothing = new Product<>("Iso Hoodies", 6000, clothingCategory) {};
        Product<GadgetCategory> gadget = new Product<>("iPhone 15", 150000, gadgetCategory) {};

        ProductCatalog<Product<?>> catalog = new ProductCatalog<>();
        catalog.addProduct(book);
        catalog.addProduct(clothing);
        catalog.addProduct(gadget);

        catalog.displayProducts();
        System.out.println("Applying discount...");
        catalog.applyDiscount(book, 10);
        catalog.applyDiscount(clothing, 15);
        catalog.applyDiscount(gadget, 5);

        catalog.displayProducts();
    }
}

