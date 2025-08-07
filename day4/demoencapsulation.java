class student
{	
	//private variables

	private String name,dept;
	private int roll;

	student(String name,int roll,String dept)
	{
		this.name=name;
		this.roll=roll;
		this.dept=dept;
	}
	
	// getter's and setter's methods to provide both read and write mode for the user
	
	//providing only get method's ensures it's a read_only mode
	public void getName()
	{
		System.out.println("Name: "+this.name);
	}
	public void getRoll()
	{
		System.out.println("Roll number: "+this.roll);
	}
	public void getDept()
	{
		System.out.println("Depatment: "+this.dept);
	}

	//providing only setter method's ensures it's a write only mode
	public void setName(String name)
	{
		this.name=name;
	
	}
	public void setRoll(int roll)
	{
		this.roll=roll;
	}
	public void setDept(String dept)
	{
		this.dept=dept;
	}

	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll number: "+roll);
		System.out.println("Department: "+dept);
	}
	
}

class demoencapsulation
{
	public static void main(String[] qwe)
	{
		student std=new student("adam",981,"ISE");
		
		System.out.println("accessing the values");

		std.getName();
		std.getRoll();
		std.getDept();
		
		System.out.println("\nmodifying the values"); 

		std.setName("Bilal");
		std.setRoll(982);
		std.setDept("EEE");

		//display
		std.display();
		
				
	}
}