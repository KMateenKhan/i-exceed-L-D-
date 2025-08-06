class sample			// super class
{
    
     public void display()
	{
		System.out.println("display in super class");
	}
}
 
 
class sample1 extends sample  	// derived class
{
    
     public void display()
	{
	   System.out.println("display in derived class");
	}
}
 
 
class demooverride
{
    public static void main(String asd[])
	{
	        sample ref; // reference point 
		sample objs=new sample();
		sample1 objd=new sample1();
		ref=objd;
		ref.display();  // execute's the dipslay method in the derived class

		ref=objs;    // point's to base class
		ref.display();// execute's the dipslay method in the derived class

	}
}
