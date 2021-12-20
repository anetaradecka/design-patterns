import Librarian.BookInterface.DetectiveStory;
import Librarian.BookInterface.LoveStory;
import Librarian.Librarian;

public class Main {
    public static void main(String[] args) {
        Librarian librarian = new Librarian("bibliotekarz");
        librarian.setBookInterface(new DetectiveStory());
        librarian.lendBook();

        //nowa książka
        librarian.setBookInterface(new LoveStory());
        librarian.lendBook();
    }
}
