import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean repeat = true;
        Scanner input = new Scanner(System.in);  // input object
        System.out.print("Hello!");

        while (repeat){
            ShowMenu();
            System.out.print("Enter your choice (1-9): ");
            int choice = Integer.parseInt(input.nextLine());  // Choose 1-7
            if (choice == 7){
                repeat = false;
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



