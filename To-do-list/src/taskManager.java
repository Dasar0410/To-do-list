import java.util.ArrayList;
import java.util.List;


public class taskManager {
    private List<Task> tasks;
    private int nextId;

   public taskManager() {
       tasks = new ArrayList<Task>();
       nextId = 1;
    }

    public void addTask(String name, String description){
       // adds task to arraylist based on input from main
        Task newTask = new Task(name,nextId,description,false);
        tasks.add(newTask);
    }
}
