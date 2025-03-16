package practice1;

public class Book {
    private String title;
    private  String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    //getters
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    //setters
    public void setTitle(String newTitle) {
        this.title = newTitle;
    }
    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }
    public void printInfo() {
        System.out.println("Title: " + this.title + " , " + "Author: " + this.author);
    }

}
