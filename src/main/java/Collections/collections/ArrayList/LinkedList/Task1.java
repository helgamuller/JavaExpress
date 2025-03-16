package Collections.collections.ArrayList.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Task1 {
    private LinkedList<String> list;

    public LinkedList<String> getList() {
        return list;
    }

    public Task1(){
        this.list = new LinkedList<>();
    }
    public void addElements(String... elements) {
        Collections.addAll(list, elements);
    }
    public void print(){
        list.forEach(System.out::println);
    }
}
