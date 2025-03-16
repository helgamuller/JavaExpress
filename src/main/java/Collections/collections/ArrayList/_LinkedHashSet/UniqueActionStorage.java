package Collections.collections.ArrayList._LinkedHashSet;

import java.util.Collections;
import java.util.LinkedHashSet;

//Реализуйте механизм хранения уникальных действий на сайте на основе LinkedHashSet.
public class UniqueActionStorage {
    private LinkedHashSet<Integer> actions;

    public UniqueActionStorage(){
        this.actions = new LinkedHashSet<>();
    }

    public void addActions(Integer... elements){
        Collections.addAll(actions,elements);
    }
    public void addSingleAction(Integer action) {
        actions.add(action);
    }
    public void printActions(){
        actions.forEach(System.out::println);
    }
}
