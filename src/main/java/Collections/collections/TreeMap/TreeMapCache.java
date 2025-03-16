package Collections.collections.TreeMap;
//Реализуйте механизм кэширования, где ключи автоматически удаляются, если они устарели.

import java.util.TreeMap;

public class TreeMapCache {
    private static TreeMap<Long, Integer> cache;
    private static long lifespan;
    static {
        cache = new TreeMap<>();
        lifespan = 3000;
    }
        private  static void removeExpired(){
        long now = System.currentTimeMillis();
        while(!(cache.isEmpty())&&(now- cache.firstKey()>lifespan)){
            cache.pollFirstEntry();
        }
        }
        private static void addNew(Integer num){
        removeExpired();
        cache.put(System.currentTimeMillis(), num);
        }
        private static void print(){
        removeExpired();
        cache.forEach((key, value)-> System.out.println(key + " " + value));
            System.out.println();
        }

    public static void main(String[] args) throws InterruptedException {
        addNew( 1);
        Thread.sleep(1000);
        print();
        addNew( 2);
        Thread.sleep(1000);
        print();
        addNew(3);
        Thread.sleep(1000);
        print();
        addNew( 4);
        Thread.sleep(1000);
        print();
        Thread.sleep(1000);
        print();
        Thread.sleep(1000);
        print();




    }
}
