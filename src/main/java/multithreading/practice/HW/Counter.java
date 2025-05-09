package multithreading.practice.HW;
///Yсловие задачи: Напишите класс Counter с методом increment, увеличивающим значение счётчика. Создайте два потока, каждый из которых вызывает increment() 1000 раз. Обеспечьте правильную работу с помощью synchronized.
////Подсказка к решению:
////В классе Counter создайте метод public synchronized void increment().
////Храните счетчик в переменной int count.
////Создайте два потока, которые вызывают метод increment() в цикле.
////После завершения потоков выведите финальное значение count — оно должно быть 2000.
public class Counter {
    private  int count = 0;

    public synchronized void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        Thread t2 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.getCount());
    }
}
