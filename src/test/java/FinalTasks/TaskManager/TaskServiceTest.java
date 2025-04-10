package FinalTasks.TaskManager;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTest extends TaskManagerTestSetup{
    /**
     *      addTask method test
     * Positive case:
     *      id=11, status='Active', priority=1, date
     * Negative case:
     *        id=10, status='Active', priority=1, date
     *
     */
    @Test
    @DisplayName("user Can Add Task with Unique Id To TaskService")
    public void userCanAddTaskToTaskService(){
        Task task = new Task<Integer>(11,1, "Active");
        service.addTask(task);
        assertEquals(11, task.getId());
    }

    @Test
    @DisplayName("user Can Not Add Task with Existing Id To TaskService")
    public void userCanNotAddTaskToTaskService(){
        Task task = new Task<Integer>(10,1, "Active");
        assertThrows(RuntimeException.class,()->
        service.addTask(task));
    }

    /**
     *      removeTask method test
     * Positive case:
     *      id=10
     * Negative case:
     *        id=11
     *
     */
    @Test
    @DisplayName("user Can Remove An Existing Task from TaskService")
    public void userCanRemoveTaskFromTaskService(){
        service.removeTask(task);
        List<Task<?>>list = service.getListOfTasks();
        assertFalse(list.contains(task));

    }

    @Test
    @DisplayName("user Can Not Remove  Existing Task From TaskService")
    public void userCanNotRemoveTaskFromTaskService(){
        Task task2 = new Task<Integer>(12,1, "Active");
        List<Task<?>>listBeforeAttemptOfRemoval = service.getListOfTasks();
        service.removeTask(task2);
        List<Task<?>>listAfterAttemptOfRemoval = service.getListOfTasks();
        assertEquals(listBeforeAttemptOfRemoval, listAfterAttemptOfRemoval);

    }

    /**
     *      filterByPriority method test
     * Positive case:
     *      id=10, status='Active', priority=1, date
     * Negative case:
     *        id=11, status='Active', priority=1, date
     */

    @Test
    @DisplayName("user CAN filter out Tasks from TaskService by Priority")
    public void userCanFilterTasksByPriority(){
        List<Task<?>>list = service.filterTasksByPriority(1);
        int priority = list.get(0).getPriority();
        assertEquals(1, priority);
    }

    @Test
    @DisplayName("user CAN NOT filter out Tasks from TaskService by Priority")
    public void userCanNotFilterTasksByPriority(){
        assertTrue(service.filterTasksByPriority(2).isEmpty());
    }

    /**
     *      filterByStatus method test
     * Positive case:
     *      id=10, status='Active', priority=1, date
     * Negative case:
     *        id=11, status='Active', priority=1, date
     */

    @Test
    @DisplayName("user CAN filter out Tasks from TaskService by Status")
    public void userCanFilterTasksByStatus(){
        List<Task<?>>list = service.filterTasksByStatus("Active");
        String status = list.get(0).getStatus();
        assertEquals("Active", status);
    }

    @Test
    @DisplayName("user CAN NOT filter out Tasks from TaskService by Status")
    public void userCanNotFilterTasksByStatus(){
        assertTrue(service.filterTasksByStatus("Passive").isEmpty());
    }


}
