package Collections.collections.ArrayList.HashMap;

import java.util.HashMap;

////Реализуйте механизм кеширования данных в HashMap с ограничением по времени хранения.
public class CacheHashMap {
    private HashMap<String, Long> cache;
    private final static long timestamp = 3000;
    public CacheHashMap(){
        this.cache = new HashMap<>();
    }
    //add with current system time
    public void add(String str) {
        removeExpired();
        cache.put(str, System.currentTimeMillis());
    }
    //before add and before print check if exists(removeExpired)
    public void removeExpired(){
        long now = System.currentTimeMillis();
        cache.values().removeIf((value)->(now-value)>timestamp);
    }
    public void print(){
        removeExpired();
        if (cache.isEmpty()) {
            System.out.println("Empty cache");
        }
        else {
            cache.forEach((key, value) -> System.out.println("Key is: " + key + " Value is " + value));
            System.out.println();
        }
    }

}
