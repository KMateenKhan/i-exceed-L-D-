package todo;
import java.util.ArrayList;

class ToDoList
{
	private ArrayList<Task> tasks = new ArrayList<>();

	public void addTask(String description)
	{
		tasks.add(new Task(description));
	}

	public void showTasks()
	{
		if(tasks.isEmpty())
		{
			System.out.println("No tasks have been added yet.");
			return;
		}
		for(int i=0;i<tasks.size();i++) // index in ArrayList starts with zero
		{
			System.out.println((i+1)+"."+tasks.get(i));
		}
	}
	
	
	public void markTaskCompleted(int index)
        {
        	if (index >= 0 && index < tasks.size()) {
            		tasks.get(index).markCompleted();
        	} else {
            		System.out.println("Invalid task number.");
        		}
    	}

        public void deleteTask(int index) 
        {
               if (index >= 0 && index < tasks.size()) {
                        tasks.remove(index);
               } else {
                       System.out.println("Invalid task number.");
                      }
        }
	
	public void filterTasks(boolean completed)
	{
		for(Task task:tasks)
		{
			if(task.isCompleted()==completed)
			System.out.println(task);
		}
	}

	
}