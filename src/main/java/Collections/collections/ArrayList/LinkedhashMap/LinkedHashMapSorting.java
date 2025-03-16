package Collections.collections.ArrayList.LinkedhashMap;

import java.util.*;

///Напишите метод, который отсортирует LinkedHashMap по значениям.
////Реализуйте LRU-кэш (Least Recently Used) на основе LinkedHashMap.
public class LinkedHashMapSorting {
    private LinkedHashMap<String, Integer> list;

    public LinkedHashMapSorting(){
        this.list = new LinkedHashMap<>();
    }
    public void add(String str, Integer num){
        list.put(str, num);
    }

    public LinkedHashMap<String, Integer> sort(){
        List<Map.Entry<String,Integer>> arrayList = new ArrayList<>(list.entrySet()); //create a list of entry sets of a Map
        //sort
        arrayList.sort(Map.Entry.comparingByValue());//comparing
        //create new list
        LinkedHashMap<String, Integer> orederedList = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry: arrayList) //for each elemetn of array list
        {orederedList.put(entry.getKey(), entry.getValue()); //add this
        }
        return orederedList;
    }
    public void print(LinkedHashMap<String, Integer> orderedList){
        orderedList.forEach((key, value)-> System.out.println(key + " " + value));
    }
}
