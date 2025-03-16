package Collections.collections.ArrayList.LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorForList {
    private LinkedList<String> list;



    public IteratorForList(){
        this.list = new LinkedList<>();

    }

    public void addElemets(String... elements) {
        Collections.addAll(list, elements);
    }
    public void print(){
        list.forEach(System.out::println);
        System.out.println();
    }
    public void iterateForward(){
        ListIterator<String> iterator= list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());;
        }
    }
    public void iterateBack() {
        ListIterator<String> iterator= list.listIterator(list.size());
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
    }
}
