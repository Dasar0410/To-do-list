import java.util.Scanner;
// Console based menu that interacts with user and calls the corresponding method from taskManager
public class Main {

    public static void main(String[] args) {
        boolean repeat = true;
        Scanner input = new Scanner(System.in);  // input object
        System.out.print("Hello!");
        int id = 1; // remove

        while (repeat){
            ShowMenu();
            System.out.print("Enter your choice (1-7): ");
            int choice = Integer.parseInt(input.nextLine());  // Choose 1-7
            switch(choice){
                case 1:
                    System.out.print("What is the taskname:");
                    String name = input.nextLine();
                    String description = "test";
                    taskManager.addTask(name,id,description,false);
                    id++; // remove
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
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


}



