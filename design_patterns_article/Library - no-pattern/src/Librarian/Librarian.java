package Librarian;

public class Librarian {
    private String name;

    public Librarian(String name) {
        this.name = name;
    }

    public void lendBook() {
        System.out.println("Wypożyczam powieść");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
