package Collections.collections.PirorityQueueTasks;

import java.util.PriorityQueue;

//Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.
//Реализуйте очередь задач с приоритетами. Добавьте несколько задач и извлеките их по приоритету.
//Используйте PriorityQueue для сортировки объектов по приоритету.
//
//Дополнительные по желанию:
//Реализуйте PriorityQueue, в которой можно изменять приоритет уже добавленного элемента.
//Напишите систему планирования задач, где задачи выполняются по приоритету, а при равном приоритете – по порядку добавления.
public class SimplePriorityQueue {
    private static PriorityQueue<Integer> queue;
    private  static PriorityQueue<PTasks> taskQueue;

    static {
        queue = new PriorityQueue<>();
        taskQueue = new PriorityQueue<>();
    }
    private static void print(){
        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println();

    }
    private static void returnTasks(){
        while (!taskQueue.isEmpty()){
            System.out.println(taskQueue.poll());
        }
    }
//Используйте PriorityQueue для сортировки объектов по приоритету.
    private static void printTasks(){
     while (!taskQueue.isEmpty()) {
         System.out.println(taskQueue.poll());
     }

    }
    //Реализуйте PriorityQueue, в которой можно изменять приоритет уже добавленного элемента.
    private static void changePriority(String name, Integer newPriority) {
        taskQueue.removeIf((task)->task.getTask().equals(name));
        taskQueue.offer(new PTasks(name,newPriority));
    }
    ////Напишите систему планирования задач, где задачи выполняются по приоритету, а при равном приоритете – по порядку добавления.




    public static void main(String[] args) {
      /*  queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        print();

        */
        taskQueue.offer(new PTasks("S", 3));
        taskQueue.offer(new PTasks("First", 1));
        taskQueue.offer(new PTasks("Second", 2));
        printTasks();


       /* returnTasks();
        changePriority("First", 4);
        System.out.println();
        printTasks();
        */
    }


}
