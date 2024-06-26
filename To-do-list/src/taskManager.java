import java.util.ArrayList;
import java.util.List;


public class taskManager {

   public taskManager() {
       ArrayList<task> tasks = new ArrayList<task>();
    }

    public static void addTask(String name, int id){
        task newTask = new task(name,id );
    }
}
