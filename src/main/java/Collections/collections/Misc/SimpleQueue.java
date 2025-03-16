package Collections.collections.Misc;

import java.util.PriorityQueue;
import java.util.Queue;

public class SimpleQueue {
    private static Queue<String> queue;
    private static Queue<TasksWithDue> taskQueue;
    static  {
        queue = new PriorityQueue<>();
        taskQueue = new PriorityQueue<TasksWithDue>();
    }
    private static void removeTask(String name){
        taskQueue.removeIf((task)-> task.getTask().equals(name));
    }






    public static void main(String[] args) {
      /*  queue.add("Ivanoff");
        queue.add("Petroff");
        queue.add("Sirotkin");
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

       */
        taskQueue.add(new TasksWithDue("Chores", 3));
        taskQueue.add(new TasksWithDue("Work", 1));
        taskQueue.add(new TasksWithDue("Dinner", 2));
        removeTask("Dinner");
        taskQueue.forEach((task)-> System.out.println(task));
    }
}
