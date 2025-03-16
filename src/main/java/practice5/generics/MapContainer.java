package practice5.generics;

import java.util.HashMap;
import java.util.Map;

//Коллекция с обобщёнными типами: Создайте Map<K, V> и реализуйте метод, который принимает обобщённые ключи и значения, а затем выводит их.
public class MapContainer <K, V>{
    private Map<K, V> map;
    private K key;
    private V value;

    public MapContainer(K key, V value) {
        this.key = key;
        this.value = value;
        map = new HashMap<>();
    }

    private void takeAndPrint(K key, V value) {
        map.put(key, value);
        map.forEach((k, v)-> System.out.println(key + " " + value));
    }


    public static void main(String[] args) {
        MapContainer map = new MapContainer(11, "Olga");
        map.takeAndPrint(12,"Andrey");
    }

}
