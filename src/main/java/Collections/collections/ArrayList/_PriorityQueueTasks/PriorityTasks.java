package Collections.collections.ArrayList._PriorityQueueTasks;

public class PriorityTasks implements Comparable<PriorityTasks>{
       private String task;
       private int priority;

       public PriorityTasks(String task, int priority){
           this. task = task;
           this.priority = priority;
       }

    @Override
    public int compareTo(PriorityTasks other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return task + " priority: " + priority;
    }

    public String getTask() {
        return task;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
