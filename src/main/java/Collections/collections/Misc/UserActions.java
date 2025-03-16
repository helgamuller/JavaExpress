package Collections.collections.Misc;

import java.util.ArrayDeque;

public class UserActions {
    private  static ArrayDeque<String> actions;
    private static String lastAction;
    static {
        actions = new ArrayDeque<>();
        lastAction  = null;
    }
    //remove last action
    //store last action? repeat
    //add new action
    private static void addAction(String action){
        actions.push(action);
    }

    private static void removeLastAction(){
        lastAction = actions.peek();
        actions.pop();
    }
    private  static  void repeatLastAction(){
        actions.push(lastAction);
    }

    public static void main(String[] args) {
        addAction("Add");
        addAction("Correct");
        addAction("DElete");
        actions.forEach(System.out::println);
        System.out.println();
        removeLastAction();
        actions.forEach(System.out::println);
        System.out.println();
        repeatLastAction();
        actions.forEach(System.out::println);

    }
}
