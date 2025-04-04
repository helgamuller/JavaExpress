package multithreading.practice.HW;
//Условие задачи: Создайте два потока. Один поток должен печатать "A", второй — "B", каждый по 5 раз с небольшой задержкой.
//Подсказка к решению:
//Создайте два класса или объекта Runnable.
//Запустите оба потока через Thread и start().
//Задержку организуйте с помощью Thread.sleep(500).
public class TwoThreads implements Runnable{
    private String str;
    public TwoThreads(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(str);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public static void main(String[] args) throws InterruptedException {

        TwoThreads thread1 = new TwoThreads("A");
        TwoThreads thread2 = new TwoThreads("B");

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start();
        Thread.sleep(200);
        t2.start();

        t1.join();
        t2.join();


    }
}
