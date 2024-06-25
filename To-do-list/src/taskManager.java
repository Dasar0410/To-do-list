import java.util.ArrayList;
import java.util.List;

public class taskManager {
    private List<Task> tasks;

   /* public taskManager() {
        task newTask = new task();
    }
*/
    public static void addTask(String name, int id){
        task newTask = new task(name,id );
    }
}
