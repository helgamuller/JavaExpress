package multithreading.practice.atomicValues;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AtomicCounter atomicCounter = new AtomicCounter();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                //count.incrementAndGet();
                atomicCounter.increment();
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                //count.incrementAndGet();
                atomicCounter.increment();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Number f operation: " + atomicCounter);

    }
}
