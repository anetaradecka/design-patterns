package Librarian;

import Librarian.BookInterface.BookInterface;

public class Librarian {
    private String name;
    private BookInterface bookInterface;

    public Librarian(String name) {
        this.name = name;
    }

    public void lendBook() {
        this.bookInterface.lendBook();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BookInterface getBookInterface() {
        return bookInterface;
    }

    public void setBookInterface(BookInterface bookInterface) {
        this.bookInterface = bookInterface;
    }
}
