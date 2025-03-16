package Collections.collections.ArrayList.LinkedhashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    private LinkedHashMap<String, Integer> cache;

    public LRUCache() {
        this.cache = new LinkedHashMap<String, Integer>(5,0.75f, true)
        {
            protected boolean removeEldestEntry(Map.Entry <String, Integer> eldest){
            return size()>3;
        }
        };

    }
    public void add(String str, Integer num){
        cache.put(str, num);
    }
    public void get(String str){
        cache.get(str);
    }

    public  void print() {
        cache.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println();
    }
    }
