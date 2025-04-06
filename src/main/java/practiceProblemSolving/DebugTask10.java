package practiceProblemSolving;
//Код должен удалять элементы списка, но выбрасывает ConcurrentModificationException.

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class DebugTask10 {
    public static void main(String[] args) {
        List<String> names = new CopyOnWriteArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        for (String name : names) {
            if (name.startsWith("A")) {
                names.remove(name);

            }
        }
        System.out.println(names);;
    }
}


