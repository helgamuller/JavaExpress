package Collections.collections.ArrayDequeuTasks;
//Реализуйте систему отмены и повтора действий с ArrayDeque.

import java.util.ArrayDeque;

public class RepetitiveActions {
    private static ArrayDeque<String> actions;
    private static String lastRemovedAction;
    static {
        actions = new ArrayDeque<>();
        lastRemovedAction = null;
    }
    //add action
    //remove last action
    //repeat last action
    private static void addAction(String action) {
        actions.push(action);
    }
    private static void removeLastAction(){
        lastRemovedAction = actions.peek();
        actions.pop();
    }
    private static void repeatLastAction(){
        actions.addFirst(lastRemovedAction);

    }

    public static void main(String[] args) {
        addAction("1");
        addAction("2");
        addAction("3");
        removeLastAction();
        actions.forEach(System.out::println);
        System.out.println();
        repeatLastAction();
        actions.forEach(System.out::println);
        System.out.println();
        repeatLastAction();
        actions.forEach(System.out::println);


    }
}
