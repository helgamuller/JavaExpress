package Collections.collections.ArrayList._PriorityQueueTasks;
//Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.
//Реализуйте очередь задач с приоритетами. Добавьте несколько задач и извлеките их по приоритету.
//Используйте PriorityQueue для сортировки объектов по приоритету.
//
//Дополнительные по желанию:
//Реализуйте PriorityQueue, в которой можно изменять приоритет уже добавленного элемента.
//Напишите систему планирования задач, где задачи выполняются по приоритету, а при равном приоритете – по порядку добавления.
import java.util.PriorityQueue;
import java.util.Queue;

public class SimplePQ {
    private static Queue<Integer> queue = new PriorityQueue<>();
    private static void processQueue(){
        while(!queue.isEmpty())
        System.out.println(queue.poll());

    }
    //Реализуйте очередь задач с приоритетами. Добавьте несколько задач и извлеките их по приоритету.
    private static Queue<PriorityTasks> taskQueue = new PriorityQueue<>();

    private static void processPriorityTasks(){
        while(!taskQueue.isEmpty())
            System.out.println(taskQueue.poll());
        System.out.println();
    }

    //Напишите систему планирования задач, где задачи выполняются по приоритету, а при равном приоритете – по порядку добавления.
    //if

    //Используйте PriorityQueue для сортировки объектов по приоритету.
//Реализуйте PriorityQueue, в которой можно изменять приоритет уже добавленного элемента.
    private void addTask(String name, int priority){
        taskQueue.add(new PriorityTasks(name,priority));

    }
    private  static void updatePriority(String name, int newPriority){
        taskQueue.removeIf(task->task.getTask().equals(name));
        taskQueue.add(new PriorityTasks(name, newPriority));
    }

    public static void main(String[] args) {
    SimplePQ.queue.offer(1);
    SimplePQ.queue.offer(2);
    SimplePQ.queue.offer(3);
    SimplePQ.processQueue();
    SimplePQ.taskQueue.offer(new PriorityTasks("First", 1));
    SimplePQ.taskQueue.offer(new PriorityTasks("Second", 2));
    SimplePQ.processPriorityTasks();
    SimplePQ.updatePriority("First", 3);
    SimplePQ.processPriorityTasks();


    }
}
