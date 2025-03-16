package practice2;

public class Library {
    private String bookTitle;
    protected String author;
    int year;
    public String cathegory;

    public String getBookTitle(){
        return this.bookTitle;
    }
    public String getAuthor() {
        return  this.author;
    }
    public int getYear() {
        return this.year;
    }
    public String getCathegory() {
        return  this.cathegory;
    }
    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public void setBookTitle(String newBookTitle) {
        this.bookTitle = newBookTitle;
    }

    public void setCathegory(String newCathegory) {
        this.cathegory = newCathegory;
    }

}
