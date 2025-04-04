package multithreading.practice.HW;
//Условие задачи: Создайте поток, который бесконечно увеличивает счетчик. В основном потоке через 2 секунды установите флаг stop = true, чтобы остановить поток.
//Подсказка к решению:
//Объявите переменную volatile boolean stop.
//В рабочем потоке используйте цикл while (!stop).
//Основной поток должен заснуть на 2 секунды и затем установить stop = true.
public class VolatileTask implements Runnable {
    private volatile boolean stop;

    @Override
    public void run() {
        int counter = 0;
        while(!stop) {
            counter++;
            System.out.println(counter);
        }
    }
    public void stop(){
        this.stop = true;
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileTask task = new VolatileTask();
        Thread t1 = new Thread(task);
        t1.start();
        Thread.sleep(2000);
        task.stop();

        t1.join();
    }
}
