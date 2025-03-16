package Collections.collections.Misc;

import java.util.TreeSet;

public class SortedNumbers {
    private static TreeSet<Integer> tree;
    static {
        tree = new TreeSet<>();
    }

    public static void main(String[] args) {
        tree.add(1);
        tree.add(45);
        tree.add(-3);
        Integer min = tree.getFirst();
        Integer max = tree.getLast();
        System.out.println("Min is: " + min + " Max is: "+ max);
    }
}
