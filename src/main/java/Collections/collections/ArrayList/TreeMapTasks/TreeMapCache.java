package Collections.collections.ArrayList.TreeMapTasks;
//Реализуйте механизм кэширования, где ключи автоматически удаляются, если они устарели.

public class TreeMapCache {
    private static java.util.TreeMap<Long, String> cache = new java.util.TreeMap<>();
    private final static long timestamp = 5000;
    static long now;

    private static void add(String str){
        removeExpired();
        cache.put(now,str);
    }


    public static void removeExpired(){
        now = System.currentTimeMillis();
        while((!cache.isEmpty())&&(now - cache.firstKey()) >timestamp) {
            cache.pollFirstEntry();
        }
        }


    private static void print(){
        TreeMapCache.removeExpired();
        cache.forEach((key, value) -> System.out.println(key + "->" + value));
        System.out.println();
    }

    public static void main(String[] args) throws InterruptedException {
        TreeMapCache.add("Anna");
        Thread.sleep(2000);
        TreeMapCache.add("Olga");
        Thread.sleep(2000);
        TreeMapCache.add("Vera");
        TreeMapCache.print();
        Thread.sleep(2000);
        TreeMapCache.add("Katya");
        TreeMapCache.print();


    }


}
