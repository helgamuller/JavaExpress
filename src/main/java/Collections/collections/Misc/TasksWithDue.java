package Collections.collections.Misc;

public class TasksWithDue implements Comparable<TasksWithDue>{
    private String task;
    private Integer due;
     public TasksWithDue(String task, Integer due){
         this.task = task;
         this.due = due;
     }

    @Override
    public int compareTo(TasksWithDue other) {
        return Integer.compare(this.due, other.due);
    }

    @Override
    public String toString() {
        return task + " (DueDate "+ due +" )";
    }

    public String getTask() {
        return task;
    }

    public Integer getDue() {
        return due;
    }
}
