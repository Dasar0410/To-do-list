public class task{
    String name;
    String description;
    int id;
    Boolean isCompleted;

    public task(String name, int id){
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

