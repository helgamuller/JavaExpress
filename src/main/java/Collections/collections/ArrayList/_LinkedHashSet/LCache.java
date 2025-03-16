package Collections.collections.ArrayList._LinkedHashSet;

import java.util.Collections;
import java.util.LinkedHashSet;

//Реализуйте кэш последних 5 уникальных страниц, которые посетил пользователь.
public class LCache {
    private LinkedHashSet<String> linkedHashSet;
    //add unique pages
    //before adding check if there are more than 5 and delete first

    public LCache(){
        this.linkedHashSet = new LinkedHashSet<>();
    }
    public void addElements(String... elements){
        Collections.addAll(linkedHashSet, elements);
    }
    public void addElement(String string) {
        while (linkedHashSet.size() > 4) {
            linkedHashSet.removeFirst();
        }
        linkedHashSet.add(string);
    }

        public void print() {
            linkedHashSet.forEach(System.out::println);
            System.out.println();

        }
    }