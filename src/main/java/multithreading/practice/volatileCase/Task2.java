package multithreading.practice.volatileCase;
//Условие задачи: Создайте поток, который бесконечно увеличивает счетчик. В основном потоке через 2 секунды установите флаг stop = true, чтобы остановить поток.
//Подсказка к решению:
//Объявите переменную volatile boolean stop.
//В рабочем потоке используйте цикл while (!stop).
//Основной поток должен заснуть на 2 секунды и затем установить stop = true.
public class Task2 implements Runnable{
    private volatile boolean stop;

    public void stop()
    {
        this.stop = true;
    }
    public static void main(String[] args) throws InterruptedException {
        Task2 task = new Task2();
        Thread t1 = new Thread(task);
        t1.start();
        Thread.sleep(500);
        task.stop();

    }

    @Override
    public void run() {
        int i=0;
        while(!stop) {
            i++;
            System.out.println(i);
        }
    }


}
