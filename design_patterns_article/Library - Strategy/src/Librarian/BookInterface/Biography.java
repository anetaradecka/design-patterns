package Librarian.BookInterface;

public class Biography implements BookInterface {
    @Override
    public void lendBook() {
        System.out.println("Wypożyczam biografię");
    }
}
