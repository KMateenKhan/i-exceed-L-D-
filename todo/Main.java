package todo;
import java.util.Scanner;


class Main
{
	static Scanner sc=new Scanner(System.in);
	static ToDoList todolist=new ToDoList(); // aggregating the todolist class
	
	public static void main(String qwe[])
	{
		showMenu();
		sc.close();
	}
	
	//boolean running=true;

	public static void showMenu() // to make sure the menu displayed until the user quits
	{
		
	   	System.out.println("\n--- To-Do List ---");
            	System.out.println("1. Add Task");
            	System.out.println("2. View Tasks");
            	System.out.println("3. Mark Task as Completed");
		System.out.println("4. Filtered tasks");
            	System.out.println("5. Delete Task");
            	System.out.println("6. Exit");
            	System.out.print("Choose an option: ");

		int choice=sc.nextInt();
		sc.nextLine();
		
		switch(choice)
		{
			case 1:
				System.out.print("Enter task description: ");
                                String desc = sc.nextLine();
                                todolist.addTask(desc);
                                break;
                        case 2:
                                todolist.showTasks();
                                break;
                        case 3:
                                System.out.print("Enter task number to mark as completed: ");
				int completeIndex=sc.nextInt()-1;
				todolist.markTaskCompleted(completeIndex);
                                break;
			case 4:
				System.out.print("Show completed tasks?(true/false):");
				boolean completed = sc.nextBoolean(); // to read boolean values
				todolist.filterTasks(completed);
				break;
                	case 5:
                    		System.out.println("Enter task number to delete: ");
                    		int deleteIndex = sc.nextInt() - 1;
                    		todolist.deleteTask(deleteIndex);
                    		break;
                	case 6:
                    		//running = false;
                   		System.out.println("Exit!");
				return;
			
			default:
				System.out.println("Invalid choice.");

		}
	
	showMenu();
	}
     
}
