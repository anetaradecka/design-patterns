package Librarian.BookInterface;

public class DetectiveStory implements BookInterface {
    @Override
    public void lendBook() {
            System.out.println("Wypożyczam powieść detektywistyczną");
    }
}
