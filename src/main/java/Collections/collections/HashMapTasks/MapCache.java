package Collections.collections.HashMapTasks;
//Реализуйте механизм кеширования данных в HashMap с ограничением по времени хранения.

import java.util.HashMap;
import java.util.Map;

public class MapCache {
    private Map<String, Long> cache;
    private final long lifespan = 5000;

    public MapCache(){
        this.cache = new HashMap<>();
    }
    protected void addKey(String key){
        removeExpired();
        cache.put(key, System.currentTimeMillis());
    }
    protected void removeExpired(){
        Long now = System.currentTimeMillis();
        cache.values().removeIf((value) ->(now-value)>lifespan);
    }
    protected void print(){
        removeExpired();
        cache.forEach((key, value) -> System.out.println(key + value));
        System.out.println();
    }


}
