package Collections.collections.HashSetTasks;
//Реализуйте кэш из HashSet, который автоматически удаляет старые записи через определённый интервал.

import java.util.*;

public class HashCache {
    private static Set<Integer> cache;
    private static Map<Integer, Long> timestamps;
    private final static long timestamp;
    static{
        cache = new HashSet<>();
        timestamps = new HashMap<>();
        timestamp = 5000;
    }
    private static void addAnElement(Integer num){
        cache.add(num);
        timestamps.put(num, System.currentTimeMillis());
        removeExpired();
    }

    private static void removeExpired() {
       // long now = System.currentTimeMillis();
        Iterator<Integer> it = cache.iterator();
            while (it.hasNext()) {
               long now = System.currentTimeMillis();
               Integer num = it.next();
                if ((now - timestamps.get(num) > timestamp)) {
                    timestamps.remove(num);
                    it.remove();
                }

            }

    }
        private static void printCache() {
            removeExpired();
            cache.forEach(System.out::println);
            System.out.println();

        }
    public static void main(String[] args) throws InterruptedException {
        addAnElement(1);
        Thread.sleep(3000);
        printCache(); //1
        addAnElement(2);
        printCache();   //1,2
        Thread.sleep(3000);
        addAnElement(3);
        printCache(); //2,3


    }
}
