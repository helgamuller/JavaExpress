package Collections.collections.ArrayList.LinkedList;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListWoDuplicates {
    private LinkedList<Integer> list;

    public ListWoDuplicates() {
        this.list = new LinkedList<>();
    }
    public void addElements(Integer... elements) {
        Collections.addAll(list, elements);
    }
    public void deleteDuplicates(){
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j)))
                {list.remove(j);
                    j--;

                }
            }

        }

    }
    public void deleteDuplicatesWithHash(){
        HashSet<Integer> unique= new HashSet<>();
        ListIterator iterator = list.listIterator();

        while(iterator.hasNext()) {
            Integer current = (Integer) iterator.next();
            if (unique.contains(current)) {
                iterator.remove();
            }
            else {
                unique.add(current);
            }

        }

    }
    public void print(){
        list.forEach(System.out::println);
    }
}
