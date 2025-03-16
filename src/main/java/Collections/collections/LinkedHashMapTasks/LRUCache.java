package Collections.collections.LinkedHashMapTasks;
//Реализуйте LRU-кэш (Least Recently Used) на основе LinkedHashMap.

import java.util.LinkedHashMap;
import java.util.Map;


public class LRUCache {
    private LinkedHashMap<String,Integer> lru;
    public LRUCache(){
        this.lru = new LinkedHashMap<String, Integer>(3,0.75f, true)
        {
            @Override
            protected boolean removeEldestEntry(Map.Entry <String, Integer> eldest) {
                return size()>3;
        }
        };
    }
    protected void addLru(String str, Integer num) {
        lru.put(str, num);

    }
    protected void takeO(String str){
        lru.get(str);
    }

    protected  void print(){
        lru.forEach((key, value)-> System.out.println(key + " " + value));
        System.out.println();
    }
}
