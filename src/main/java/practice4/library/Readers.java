package practice4.library;

public class Readers {
    private String name;

    public Readers(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void getBook(Books book, Readers reader) {
        System.out.println("The book  taken " + book.getTitle() + " by " + reader.getName());
    }
    public void returnBook(Books book, Readers reader) {
        System.out.println("The book is returned" + book.getTitle() + " by " + reader.getName());
    }


}
