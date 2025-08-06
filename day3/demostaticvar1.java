class  sample
{
    int x=10;  // instance variable 
    static int y=20; // class variable aka static variable
 
    public void display()
	{
	  System.out.println("x = "+x);
	  System.out.println("y = "+y);
	}
 
    static void display1()
	{
	  System.out.println("x = "+new sample().x);// to access non-static variable in static method
	  System.out.println("y = "+y);
	}
}
 
class demostaticvar1
   {
   public static void main(String fas[])
	{
	   sample obj=new sample();  
	   obj.display();
	   sample.display1(); 
	}
  }