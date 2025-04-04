package multithreading.practice.atomicValues;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
    //count number of operations for all threads
    //private static  final AtomicInteger count = new AtomicInteger(0);


    private int count=0;
    public void increment(){
        count++;
    }

    public int getCount(){
        return this.count;
    }

}
