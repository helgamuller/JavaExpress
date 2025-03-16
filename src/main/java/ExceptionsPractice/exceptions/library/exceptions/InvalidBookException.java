package ExceptionsPractice.exceptions.library.exceptions;
//unchecked -> RuntimeException
public class InvalidBookException extends RuntimeException {
    public InvalidBookException(String message){
        super(message);
    }


}
