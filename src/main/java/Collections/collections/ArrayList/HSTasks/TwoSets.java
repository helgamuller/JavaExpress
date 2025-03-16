package Collections.collections.ArrayList.HSTasks;

import java.util.Collections;
import java.util.HashSet;

public class TwoSets {
     static HashSet<Integer>  set1= new HashSet<>() ;
     static HashSet<Integer> set2 = new HashSet<>();

    public static void addElements1(Integer... elements) {
        Collections.addAll(set1, elements);
    }

    public static void addElements2(Integer... elements) {
        Collections.addAll(set2, elements);

    }
    public static boolean isSetContains(){
       //!disjoint
        HashSet<Integer> temp = new HashSet<>(set1);
        return temp.containsAll(set2);

    }
}
