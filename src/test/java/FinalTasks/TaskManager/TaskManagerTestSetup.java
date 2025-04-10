package FinalTasks.TaskManager;

import org.junit.jupiter.api.BeforeEach;

public class TaskManagerTestSetup {
    public TaskService<Task<Integer>> service;
    public Task<Integer> task;
    @BeforeEach
    public void setupTest(){
        service = new TaskService<>();
        task = new Task<>(10, 1, "Active");
        service.addTask(task);
    }
}
