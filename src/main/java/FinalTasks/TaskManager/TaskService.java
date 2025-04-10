package FinalTasks.TaskManager;

import java.util.*;

public class TaskService<T> {
    private List<Task<?>> listOfTasks;

    public TaskService() {
        this.listOfTasks = new ArrayList<>();
    }

    public List<Task<?>> getListOfTasks() {
        return listOfTasks;
    }

    @Override
    public String toString() {
        return "TaskService{" +
                "listOfTasks=" + listOfTasks +
                '}';
    }

    public synchronized void addTask(Task<?> task){
        if(listOfTasks.contains(task)){
            throw new RuntimeException("The task is already exist");

    }
        else {
            listOfTasks.add(task);
        }
    }

    public synchronized void removeTask(Task<?> task){
        listOfTasks.removeIf(t-> t.equals(task));
    }

    public List<Task<?>> filterTasksByStatus(String status){
         return listOfTasks.stream()
                .filter(task->task.getStatus().equals(status))
                .toList();

    }
    public List<Task<?>> filterTasksByPriority(int priority){
        return listOfTasks.stream()
                .filter(task->task.getPriority()==(priority))
                .toList();
    }

    public void sortByDateAsc(){
        listOfTasks.sort(Comparator.comparing((Task<?> task)->task.getDate()));
    }

    public void sortListByDateDesc() {
        listOfTasks.sort(Comparator.comparing((Task<?> t) -> t.getDate()).reversed());

    }


    public static void main(String[] args) throws InterruptedException {
        Task task1 = new Task<>(10, 1, "Active");
        Thread.sleep(1000);
        Task task2 = new Task<>(11, 2, "Active");
        Thread.sleep(1000);
        Task task3 = new Task<>(12, 1, "Passive");
        Thread.sleep(1000);

        Task task4 = new Task<>(12, 1, "Passive");

        TaskService service = new TaskService();
        service.addTask(task1);
        service.addTask(task2);
        service.addTask(task3);
        service.addTask(task4);
       // System.out.println(service);
        service.removeTask(task2);
        //System.out.println(service);
        service.addTask(task2);
        System.out.println(service);
        System.out.println(service.filterTasksByStatus("Active"));
        System.out.println();

        System.out.println(service.filterTasksByPriority(1));
        System.out.println();
        service.sortByDateAsc();
        System.out.println(service);
        service.sortListByDateDesc();
        System.out.println(service);

    }
}
