package genericsPractice.HW;

import java.util.HashMap;
import java.util.Map;

//Коллекция с обобщёнными типами: Создайте Map<K, V> и реализуйте метод, который принимает обобщённые ключи и значения, а затем выводит их.
class GenericMap <K, V>{
   // private K key;
    //private V value;
    private Map<K, V> map;

    public GenericMap(){
        //this.key = key;
        //this.value = value;
        this.map = new HashMap<K, V>();
    }
    private void addEntry(K key, V value) {
        map.put(key, value);
    }

    private void printMap(){
        map.forEach((key, value)-> System.out.println(key + " " + value));
    }

    public static void main(String[] args) {
        GenericMap<Integer, String> map = new GenericMap();
        map.addEntry(1,"11");
        //map.addEntry("3", 2);
        map.printMap();
    }
}
