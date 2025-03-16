package Collections.collections.ArrayList.HSTasks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class TestCache {
    private  final long milliseconds;
    private final HashSet<Integer> set = new HashSet<Integer>();
    private  final HashMap<Integer, Long> timestamps = new HashMap<>();

    public TestCache(long milliseconds) {
        this.milliseconds = milliseconds;
    }
    public void add(Integer num) {
        removeExpired();
        set.add(num);
        timestamps.put(num, System.currentTimeMillis());
    }
    public boolean contains(Integer num) {
        removeExpired();
        return set.contains(num);
    }
    public void removeExpired(){
        long now = System.currentTimeMillis();
        Iterator<Integer> iterator = set.iterator();

            while(iterator.hasNext()){
                Integer num = iterator.next();
                if(now-timestamps.get(num)>=milliseconds) {
                    iterator.remove();
                    timestamps.remove(num);
                }
            }
    }
        public void print() {
            if (set.isEmpty()) {
                System.out.println("Nothing");
            } else {
                set.forEach(System.out::println);
                System.out.println();
            }
        }
    private static boolean func() {
        int[] array = {38, 46, 97, 27, 42};
        boolean a = false;
        for (int x : array) {
            if (x % 2 == 0) {
                a = !a;
            }
        }
        return a;
    }
    private static void getMatrix() {
        Random rand = new Random();
        int [][] array;
        array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j]= rand.nextInt(20);
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println(TestCache.func());
        getMatrix();    }
}
