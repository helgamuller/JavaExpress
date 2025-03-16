package Collections.collections.ArrayList._PriorityQueueTasks.ArrayDequeu;

import java.util.ArrayDeque;
//Реализуйте систему отмены и повтора действий с ArrayDeque.
public class RepetitiveTasks {
    private static ArrayDeque<String> actions;
    static String lastCancelledAction;
     static{ actions = new ArrayDeque<>();
         lastCancelledAction = null;
    }
    private static void addNewAction(String action){
        actions.addLast(action);
    }
    private static void cancelLastAction(){
        lastCancelledAction=actions.pollLast();
    }
    private static void repeatLastAction(){
        actions.addLast(lastCancelledAction);
    }

    public static void main(String[] args) {
        actions.addLast("1");
        actions.addLast("2");
        addNewAction("3");
        cancelLastAction();
        repeatLastAction();


        for(String action: actions){
            System.out.println(action);
        }
        System.out.println();

    }

}
