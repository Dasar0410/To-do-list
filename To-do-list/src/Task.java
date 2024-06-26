public class Task{
    String name;
    String description;
    int id;
    Boolean isCompleted;

    public Task(String name, int id, String description, Boolean isCompleted){
            this.name = name;
            this.id = id;
            this.isCompleted = false; // Default to false
    }

    public String getName(){
    return name;
    }

    public String getDescription(){
        return description;
    }
    public int getId(){
        return id;
    }

    public boolean getComplete(){
        return isCompleted;
    }
}

