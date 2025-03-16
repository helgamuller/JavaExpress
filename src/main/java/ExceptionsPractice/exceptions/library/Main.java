package ExceptionsPractice.exceptions.library;

import ExceptionsPractice.exceptions.library.exceptions.BookNotFoundException;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("War and Peace", "Tolstoy"));
        library.addBook(new Book("1994", "Orwell"));
        library.addBook(new Book("Onegin", "Pushkin"));
        //library.addBook(new Book("Onegin", "Pushkin"));

        try {
            library.findBook("1995");
        } catch (BookNotFoundException e) {
            System.out.println("Its exception!");
        }


    }

}
