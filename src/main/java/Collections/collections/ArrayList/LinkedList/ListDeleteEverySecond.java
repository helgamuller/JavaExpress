package Collections.collections.ArrayList.LinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListDeleteEverySecond {
    private LinkedList<Integer> list;

    public ListDeleteEverySecond(){
        this.list = new LinkedList<>();

    }

    public void addElements(Integer... elements) {
        Collections.addAll(list, elements);
    }
    public void removeEvens(){
        ListIterator<Integer> iterator = list.listIterator();
        boolean remove = false;
        while(iterator.hasNext()){
            iterator.next();

            if(remove) {
                iterator.remove();
            }
            remove = !remove;

        }

        }


    public void print(){
        list.forEach(System.out::println);
        }
}


