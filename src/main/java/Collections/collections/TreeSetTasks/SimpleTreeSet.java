package Collections.collections.TreeSetTasks;

import java.util.Collections;
import java.util.TreeSet;

//Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.
//Найдите ближайшее большее и меньшее число к заданному в TreeSet.
public class SimpleTreeSet {
    private static TreeSet<Integer> tree;
    static {
        tree = new TreeSet<>();
    }
    private static void print(){
        for(Integer element: tree) {
            System.out.println(element);
        }
        System.out.println();

    }
    private  static void  addElement(Integer num){
        tree.add(num);
    }
    private static void minAndMaxValues(Integer num){

        System.out.println("The closest  higher num is: " + tree.higher(num));
        System.out.println("The closest  lower num is: " + tree.lower(num));


    }


    public static void main(String[] args) {
        Collections.addAll(tree, 1,5,7,3,9,1);
        print();
        addElement(2);
        print();
        addElement(2);
        print();
        minAndMaxValues(4);
    }

}
