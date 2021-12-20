package Librarian.BookInterface;

public class LoveStory implements BookInterface {
    @Override
    public void lendBook() {
        System.out.println("Wypożyczam romans");
    }
}
