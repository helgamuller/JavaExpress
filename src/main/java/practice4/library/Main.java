package practice4.library;

import practice2.Library;

public class Main {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();
        Books book  = new Books("Shine");
        Readers reader = new Readers("petroff");
        manager.getBook(reader, book);
        manager.returnBook(reader, book);
    }
}
