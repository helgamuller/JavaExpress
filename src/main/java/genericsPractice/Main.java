package genericsPractice;

public class Main {

    public static void main(String[] args) {
       /* Box<String> boxString = new Box<>();
        boxString.setElement("Element");
        System.out.println(boxString.getElement());

        Box<Integer> boxInteger = new Box<>();
        boxInteger.setElement(5);
*/
        Box<Book> boxWithBooks = new Box<>();
        boxWithBooks.setElement(new Book("1776"));

        Box<Magazine> boxWithMagazines = new Box<>();
        boxWithMagazines.setElement(new Magazine("Hello"));

        Box<Book> newBox = new Box<>();
        newBox.setElement(new Book("Universe"));


    }
}
