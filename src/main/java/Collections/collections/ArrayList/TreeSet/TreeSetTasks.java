package Collections.collections.ArrayList.TreeSet;
//Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.

import java.util.Collections;
import java.util.TreeSet;

/// /Напишите метод, который добавляет числа в TreeSet, но не позволяет добавить дубликаты.
/// /Найдите ближайшее большее и меньшее число к заданному в TreeSet.
///
public class TreeSetTasks {
    private TreeSet<Integer> tree;

    public TreeSetTasks(){
        this.tree = new TreeSet<>();
    }
    public void addElement(Integer... elements){
        Collections.addAll(tree,elements);
    }
    public void lessAndGreater(Integer num) {
        System.out.println("Nearest greater number is: " + tree.ceiling(num));
        System.out.println("Nearest smaller number is: " + tree.floor(num));

    }

    public void printTree(){
        tree.forEach(System.out::println);
    }
}
