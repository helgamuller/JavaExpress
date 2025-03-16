package practice4.library;

public class LibraryManager {
    public void returnBook(Readers reader, Books book){
        reader.returnBook(book, reader);
        BookList.increaseBookAmount();
    }
    public void getBook(Readers reader, Books book) {
        reader.getBook(book, reader);
        BookList.decreaseBookAmount();

    }
}
