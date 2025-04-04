package multithreading.practice.synchronizedkeyword;

public class SafeCounter {
    //methods to increase/decrease value
    //need to implement descision in multithreading environment

    private int count = 0;

    public synchronized void increment(){
        this.count++;
    }
    public synchronized void decrement(){
        this.count--;
    }

    public synchronized int getCount() {
        return this.count;
    }
}
