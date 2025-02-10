package marketplace;


public class BookCategory {
    private String genre;

    public BookCategory(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book Category: " + genre;
    }
}
