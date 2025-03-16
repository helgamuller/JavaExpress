package ExceptionsPractice.exceptions.library.exceptions;
//checked - >Exception (children)
public class BookNotFoundException extends Exception{
    public BookNotFoundException(String message) {
        super(message);
    }
}
