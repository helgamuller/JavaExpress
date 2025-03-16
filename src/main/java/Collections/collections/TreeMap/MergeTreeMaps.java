package Collections.collections.TreeMap;

import java.util.TreeMap;

//Напишите метод, который объединяет два TreeMap, удаляя дубликаты.
public class MergeTreeMaps {
    private static TreeMap<Integer, Integer> tree1;
    private static TreeMap<Integer, Integer> tree2;
    static {
        tree1 = new TreeMap<Integer,Integer>();
        tree2 =  new TreeMap<Integer, Integer>();
    }
    private static TreeMap<Integer, Integer>margeTwoTrees(TreeMap<Integer, Integer> tree2){
       tree1.putAll(tree2);
        return tree1;
    }

    public static void main(String[] args) {
        tree1.put(1,1);
        tree1.put(2,2);
        tree2.put(2,2);
        tree2.put(3,3);
        MergeTreeMaps.margeTwoTrees(tree2);
        tree1.forEach((key, value)-> System.out.println(key + " " + value));
    }
}
