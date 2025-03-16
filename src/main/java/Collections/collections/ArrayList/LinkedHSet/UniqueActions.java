package Collections.collections.ArrayList.LinkedHSet;

import java.util.LinkedHashSet;

////Реализуйте механизм хранения уникальных действий на сайте на основе LinkedHashSet.
public class UniqueActions {
    private static LinkedHashSet<String> actions;
    static {
        actions = new LinkedHashSet<>();
    }
    private static void addActions(String string) {
        actions.add(string);
    }
    private static void clearActions(){
        while (actions.size()>2) {
            actions.removeFirst();
        }
    }
    private static void print(){
        for(String action:actions){
            System.out.println(action);
        }
    }

    public static void main(String[] args) {
        addActions("1");
        addActions("2");
        addActions("3");
        clearActions();
        print();
    }

}
