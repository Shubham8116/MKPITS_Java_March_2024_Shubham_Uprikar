//**Task Management System:**
//   - **Problem Statement:** Create a task management system where users can add, remove, and search for tasks. Each task should have properties such as `taskId`, `taskName`, `priority`, and `dueDate`. Implement functionality to display all tasks, search for a task by `taskId`, and display tasks sorted by their due dates.
//   - **Tasks:**
//     1. Add a new task to the list.
//     2. Remove a task by `taskId`.
//     3. Search for a task by `taskId` and display its details.
//     4. Display all tasks sorted by their due dates.
package TaskManagementSystem;

import TaskManagementSystem.data.TaskOperations;
import TaskManagementSystem.data.Tasks;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int choice = 0;
        LocalDate date;
        Tasks tasks;
        TaskOperations taskOperations=new TaskOperations();
        Scanner scanner = new Scanner(System.in);

        System.out.println("***************** Welcome to Tasks management system  ******************");
//creating menu driven program for Contact management system .
        while (choice != 5) {
            System.out.println("Press 1 for adding task. Press 2 to remove tsk. Press 3 to search task. Press 4 to display all tasks . Press 5 to exit.");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter task name");
                    Scanner scanner1 = new Scanner(System.in);
                    String name = scanner1.next();
                    System.out.println("Enter task id");
                    int id = scanner.nextInt();
                    System.out.println("Enter priority of task");
                    int priority = scanner.nextInt();
                    try{
                    System.out.println("Enter due date in the format - 2024-12-30 OR 2024-01-04");
                    String userDate=scanner.next();
                    date=LocalDate.parse(userDate);
                    taskOperations.addTask(id,name,priority,date);
                    }
                    catch ( Exception e)
                    {
                     System.out.println("Enter correct format of date");
                    }
                    break;

                case 2:
                    System.out.println("enter id of contact to remove");
                    int removeID = scanner.nextInt();
                    taskOperations.removeTask(removeID);
                    break;
                case 3:
                    System.out.println("enter id of contact to search");
                    int searchID= scanner.nextInt();
                    taskOperations.searchTask(searchID);
                    break;

                case 4:
                    taskOperations.displayTask();
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Enter valid choice");
                    break;
            }

        }
//        Date d=new Date();
//        System.out.println("Enter due date in the format - 2024-12-30 OR 2024-01-04");
//        Scanner scanner=new Scanner(System.in);
//        String userDate=scanner.next();
//        try {
//            LocalDate d2 = LocalDate.parse(userDate);
//            System.out.println(d2);
//        }
//        catch (DateTimeParseException e)
//        {
//            System.out.println("Enter correct format of date");
//        }

    }
}
