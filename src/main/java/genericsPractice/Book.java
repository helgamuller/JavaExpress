package genericsPractice;

public class Book implements Comparable<Book> {
    private  String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }



    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }
}
