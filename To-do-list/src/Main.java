import java.util.Scanner;
// Console based menu that interacts with user and calls the corresponding method from taskManager

// fix naming convention senere
public class Main {
    private static taskManager taskManager = new taskManager();
    private static Scanner input = new Scanner(System.in);  // input object
    public static void main(String[] args) {
        boolean repeat = true;

        System.out.print("Hello!");


        while (repeat){
            ShowMenu();
            System.out.print("Enter your choice (1-7): ");
            int choice = Integer.parseInt(input.nextLine());  // Choose 1-7
            switch(choice){
                case 1:
                    addTask();
                    break;
                case 2:
                    //removeTask();
                    break;
                case 3:
                    //completeTask();
                    break;
                case 4:
                    listTasks();
                    break;
                case 5:
                    //saveTasks();
                    break;
                case 6:
                    //loadTasks();
                    break;
                case 7:
                    repeat = false;
                    break;
            }
        }

    }
    private static void ShowMenu() {
        System.out.println("\nTo-Do List Menu:");
        System.out.println("1. Add Task");
        System.out.println("2. Remove Task");
        System.out.println("3. Mark Task as Completed");
        System.out.println("4. List All Tasks");
        System.out.println("5. Save Tasks to File");
        System.out.println("6. Load Tasks from File");
        System.out.println("7. Exit");
    }

    private static void addTask(){
        // takes in user input and sends to taskManager method
        System.out.print("What is the taskname:");
        String name = input.nextLine();
        System.out.print("What is the description:");
        String description = input.nextLine();
        taskManager.addTask(name,description);

    }

    private static void listTasks(){
        System.out.println("Here are all the tasks:");
        taskManager.listTasks();

    }
}



