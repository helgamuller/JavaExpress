package Collections.collections.TreeMap;

import java.util.TreeMap;

//Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.
//Найдите минимальный и максимальный ключ в TreeMap.
//Реализуйте TreeMap, который хранит сотрудников и их ID, с возможностью поиска ближайшего большего ID.
public class TreeMapTasks {
    private TreeMap<String, Integer> map;
    public TreeMapTasks(){
        this.map = new TreeMap<>();
    }
    protected void add(String name,Integer grade){
        map.put(name, grade);
    }
    protected void print(){
        map.forEach((key, value)-> System.out.println("Name: "+ key + " Grade: " + value));
        System.out.println();
    }
    protected void manAndMax(){
        String min = map.firstKey();
        String max = map.lastKey();
        System.out.println("Min key is: " + min + " and max is: " + max);
        System.out.println();
    }
}
