import java.util.ArrayList;
import java.util.List;


public class taskManager {

   public taskManager() {
       ArrayList<Task> tasks = new ArrayList<Task>();
    }

    public static void addTask(String name, int id, String description, boolean isCompleted){
        Task newTask = new Task(name,id,description,isCompleted);
    }
}
