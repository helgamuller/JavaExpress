package Collections.collections.ArrayList._LinkedHashSet;

import java.util.Collections;
import java.util.LinkedHashSet;
//Напишите метод, который находит пересечение двух LinkedHashSet.
public class IntersectionOfTwoSets {
    public static LinkedHashSet<Integer> set1 = new LinkedHashSet<>();
    public static LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
    //create two sets
    //fill both
    //create new set and look for intersection
    //return it
    public static void addElements(LinkedHashSet<Integer> set, Integer... elements){
        Collections.addAll(set, elements);
    }
    public static LinkedHashSet<Integer> temp;

    public static LinkedHashSet<Integer> commonElements(){
        temp = new LinkedHashSet<>(set1);
        temp.retainAll(set2);
        return temp;
    }
    public static void printCommon() {
        temp.forEach(System.out::println);
    }
}
