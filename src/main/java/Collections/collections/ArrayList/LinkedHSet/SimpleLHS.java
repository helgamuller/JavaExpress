package Collections.collections.ArrayList.LinkedHSet;
//Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.
//Напишите метод, который добавляет элемент в LinkedHashSet, но не добавляет дубликаты.
//Реализуйте кэш последних 5 уникальных страниц, которые посетил пользователь.
//Напишите метод, который находит пересечение двух LinkedHashSet.
//Реализуйте механизм хранения уникальных действий на сайте на основе LinkedHashSet.

import java.util.*;

public class SimpleLHS {
    //Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.
    private static LinkedHashSet<String> strings;
    private static LinkedHashSet<String> set2;
    static {
        strings = new LinkedHashSet<>();
        set2 = new LinkedHashSet<>();
    }
    private static <T> void print(Set<T> set) {
        for(T elment: set) {
            System.out.println(elment + " ");
        }
        System.out.println();
    }
    public static <T> void addElement(T t, Set<T> set) {
        set.add(t);
    }
    public static void addElementsUpToFIve(String str) {
        while(strings.size()>4)
        {
            strings.removeFirst();
        }
        strings.add(str);
    }
    //Напишите метод, который находит пересечение двух LinkedHashSet.
public static boolean intersectionBetweenSets(Set<String> set1, Set<String> set2){
    return set1.containsAll(set2);
}

    public static void main(String[] args) {
        Collections.addAll(strings, "1", "2", "3", "5");
      /*  print(strings);
        addElement("6", strings);
        print(strings);
        addElementsUpToFIve("7");
        print(strings);
      */
        Collections.addAll(set2,"1", "2");
        boolean intersection = intersectionBetweenSets(strings, set2);
        System.out.println(intersection);
    }
}
