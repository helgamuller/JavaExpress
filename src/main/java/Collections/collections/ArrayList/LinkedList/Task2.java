package Collections.collections.ArrayList.LinkedList;

import java.util.LinkedList;

public class Task2 {
    private LinkedList<String> queue;

    public Task2(){
        this.queue = new LinkedList<>();
    }
    public void addNewTask(String task) {
        queue.addLast(task);
    }
    public String processNextTask(){
        return queue.poll();
    }
    public void print(){
        queue.forEach(System.out::println);
    }

}
