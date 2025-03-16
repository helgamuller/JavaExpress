package Collections.collections.ArrayList.TreeMapTasks;
//Напишите метод, который объединяет два TreeMap, удаляя дубликаты.

import java.util.TreeMap;

public class MergeTreeMaps {
    private static TreeMap<Integer, String> firstTree = new java.util.TreeMap<>();
    private  static TreeMap<Integer, String> secondTree = new TreeMap<>();




    public static void main(String[] args) {
    firstTree.put(1,"ivan");
    firstTree.put(2,"pet");
    firstTree.put(3,"alex");
    secondTree.put(1, "katya");
    secondTree.put(4, "Olga");
    firstTree.putAll(secondTree);
    firstTree.forEach((key, value)-> System.out.println(key + "->" +value));
    }
}
