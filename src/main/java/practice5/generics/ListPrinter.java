package practice5.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Обобщённый метод: Реализуйте метод printList(List<?>), который принимает список любого типа и выводит его элементы.
public class ListPrinter{
     private static <T> void printList(List<T> list){
         for(T element: list) {
             System.out.println(element);
         }
     }

    public static void main(String[] args) {
        List<Integer> newList = new ArrayList<>();
        Collections.addAll(newList,2,3,1);
        printList(newList);
    }
}
