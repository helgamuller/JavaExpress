package ExceptionsPractice.exceptions.library;

import ExceptionsPractice.exceptions.library.exceptions.BookNotFoundException;
import ExceptionsPractice.exceptions.library.exceptions.InvalidBookException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Library {
    private List<Book> books;
    public Library(){
        this.books = new ArrayList<>();
    }
    //add book
    //handling edgeCase: if we add an existing book-> we got an unchecked exception InvalidBookException;
    public void addBook(Book book) throws InvalidBookException{
        if (books.contains(book)) {
            throw  new InvalidBookException("We already have this book in the library");
        } else {
            books.add(book);
        }
    }
    //lookBookOut
    //exceptionHandling:
    //if we can't find a book:
    //we got checked exception BookNotFoundException
    public Book findBook(String name) throws BookNotFoundException {
        for (Book book : books) {
            if (book.getName().equals(name)) {
                return book; // ✅ Return immediately when found
            }
        }
        throw new BookNotFoundException("Book wasn't found: " + name); // ❌ If not found, throw exception
    }
}
