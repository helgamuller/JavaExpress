package genericsPractice.HW;

import genericsPractice.Book;
import genericsPractice.Magazine;

//Обобщённый класс: Создайте класс Storage<T>, который хранит элемент и возвращает его.
class Storage<T> implements Container<Book>{
    private T element;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public static void main(String[] args) {
        Storage<Book> boxWithBooks = new Storage<>();
        boxWithBooks.setElement((new Book("Ender's game")));

        Storage<Magazine> boxWithMagazines = new Storage<>();
        boxWithMagazines.setElement(new Magazine("Go"));
        boxWithBooks.add(new Book("Book"));
        System.out.println();
    }


    @Override
    public void add(Book item) {
        System.out.println("Book " +item + " is added");
    }

    @Override
    public void get() {
        //getElement();
    }
}

