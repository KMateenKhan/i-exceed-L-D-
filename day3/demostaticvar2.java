class  demostaticvar2
{
    int x=10;  // instance variable ns
    static int y=20; // class variable aka static variable
 
    public void display()
	{
	  System.out.println("x = "+x);
	  System.out.println("y = "+y);
	}
 
    static void display1()
	{
	  System.out.println("x = "+x);//error because non-static variable cannot be referenced in static method
	  System.out.println("y = "+y);
	}
   public static void main(String fas[])
	{
	   sample obj=new sample();  
	   obj.display();
	   display1(); // since the main() is also static therefore no object or class name is required
	}
  }