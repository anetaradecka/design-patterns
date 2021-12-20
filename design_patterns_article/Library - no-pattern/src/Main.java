import Librarian.Librarian;

public class Main {
    public static void main(String[] args) {

        Librarian librarian = new Librarian("Bibliotekarz");
        // Zakładamy, że ktoś przychodzi wypożyczyć książkę
        librarian.lendBook();
    }
}
