package Collections.collections.Misc;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Task1 {
    private static HashSet<Integer> users;
    private static LinkedList<Integer> queue;
    private static HashMap<String, Integer> settings;
    private static PriorityQueue<Tasks> tasks;
    static {
        tasks = new PriorityQueue<>();
    }

    public Task1(){
        tasks = new PriorityQueue<Tasks>();

    }

    protected static void processTasks(){
       while(!tasks.isEmpty()) {
           String taskToBeProcessed = tasks.peek().getTask();
           System.out.println(taskToBeProcessed);
           tasks.poll();
       }

    }
    static {users = new HashSet<Integer>();
        queue = new LinkedList<Integer>();
        settings = new HashMap<>();
    }
    private static void print(){
        queue.forEach(System.out::println);
    }



    public static void main(String[] args) {
       /* users.add(1);
        users.add(2);
        users.add(3);
        System.out.println(users.contains(1));
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.poll();
        print();

        settings.put("Firest", 1);
        settings.put("Second", 2);
        settings.forEach((key, value) -> System.out.println(key + " " + value));*/

      //  task.tasks = new Tasks("Task1", 2);
        tasks.offer(new Tasks("1",3));
        tasks.offer(new Tasks("2",2));
        processTasks();

    }
}
