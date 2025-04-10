package FinalTasks.TaskManager;

import java.util.Date;
import java.util.Objects;

public class Task <T>{
    private T id;
    private String status;
    private int priority;
    private Date date;

    public Task(T id, int priority, String status) {
        this.id = id;
        this.date = new Date();
        this.priority = priority;
        this.status = status;
    }

    public T getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public int getPriority() {
        return priority;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", priority=" + priority +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Task<?> task = (Task<?>) o;
        return Objects.equals(id, task.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
