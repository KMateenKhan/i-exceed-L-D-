package todo;
class Task
{
	private String description;
	private boolean isCompleted;
	
	public Task(String description) // constructor for each task creation
	{
		this.description=description;
		this.isCompleted=false;
	}

	public void markCompleted() 
	{
		isCompleted=true;
	}
	
	public String description()
	{
		return description;
	}

	public boolean isCompleted()
	{
		return this.isCompleted;
	}

	@Override
	public String toString() // to provide the readable format to user whenever Task() method is run

	{
		return (isCompleted ? "['Completed']":"['Not Completed'] Task - ") + description;

	}

}