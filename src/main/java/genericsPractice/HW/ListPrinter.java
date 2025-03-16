package genericsPractice.HW;

import genericsPractice.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 class ListPrinter <T>{

    public static <T> void listPrinter(List<?> list)  {
        list.forEach((element)-> System.out.println(element));
    }
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        Collections.addAll(list, "Ivan", "Anna");
        List<Book> books = new ArrayList<>();
        Collections.addAll(books, (new Book("11111")), (new Book("22222")));
        listPrinter(books);
    }
}
