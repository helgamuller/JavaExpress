package multithreading.practice.HW;
//Условие задачи: Напишите программу, в которой создается отдельный поток, выводящий сообщение "Привет из потока!" 5 раз с паузой в 1 секунду между сообщениями.
//Подсказка к решению:
//Используйте класс Thread или реализуйте интерфейс Runnable.
//Для паузы используйте Thread.sleep(1000) (в миллисекундах).
//Основной поток (main) должен запустить созданный поток с помощью start().
public class SimpleThread implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello from a thread!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SimpleThread thread = new SimpleThread();

        Thread t1 = new Thread(thread);

        t1.start();
        t1.join();
    }
}
