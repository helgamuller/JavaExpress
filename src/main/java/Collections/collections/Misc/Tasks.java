package Collections.collections.Misc;

public class Tasks implements Comparable<Tasks>{
    private String task;
    private Integer priority;
    public Tasks(String task, Integer priority){
        this.task = task;
        this.priority = priority;
    }

    @Override
    public int compareTo(Tasks other) {
        return Integer.compare(this.priority, other.priority);
    }


    public String getTask() {
        return task;
    }

    public Integer getPriority() {
        return priority;
    }
}
