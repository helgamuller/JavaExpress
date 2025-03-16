package Collections.collections.PirorityQueueTasks;

////Реализуйте очередь задач с приоритетами. Добавьте несколько задач и извлеките их по приоритету.
public class PTasks implements Comparable<PTasks>{
    private String task;
    private Integer priority;


    public PTasks(String task, Integer priority){
        this.task = task;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return task+ " priority " + priority;
    }

    @Override
    public int compareTo(PTasks other) {
        return Integer.compare(this.priority, other.priority);
    }

    public String getTask() {
        return task;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }
}
