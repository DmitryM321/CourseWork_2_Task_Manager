import exeption.TaskNotFoundExeption;
import tasks.Task;
import java.time.LocalDate;
import java.util.Collections;
import java.util.*;
import java.util.stream.Collectors;

public class TaskService {
private Map<Integer, Task> taskMap;
private Collection <Task> removesTask;

    public TaskService() {
        this.taskMap = new HashMap<Integer, Task>();
        this.removesTask = new ArrayList<>();
    }
    public void add(Task task) {
        taskMap.put(task.getId(), task);
    }
    public Task remove(int id) throws TaskNotFoundExeption {

        if (taskMap.containsKey(id)) {
            Task remTask = taskMap.get(id);
            taskMap.remove(id);
            return remTask;
        } else {
            throw new TaskNotFoundExeption();
        }
    }
    public Collection<Task> getAllByDate(LocalDate localDate) {
        ArrayList<Task> list = new ArrayList<>();
        for (Task t : taskMap.values()) {
            if (t.appearsln(localDate)) {
                list.add(t);
            }
        }
        return list;
        }
   }

